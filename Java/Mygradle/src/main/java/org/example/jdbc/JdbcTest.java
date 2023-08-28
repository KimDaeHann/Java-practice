package org.example.jdbc;

import java.sql.*;
import java.time.LocalDate;
import java.util.Optional;
import java.util.Scanner;

public class JdbcTest {

    /**
     * 1000원 이상 산 group singer를 구하는 SELECT 문을 JDBC로 실행해보자.
     * Group_singer에 새로운 singer "르세라핌" 을 넣어 INSERT 문을 JDBC로 실행해보자
     */
    private static final String DB_URL = "jdbc:mysql://localhost:3306/chapter_80";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "28892938";

    //RDB, mySQL 접근 정보
    public static void main(String[] args) {
        //Connection 만들어야 합니다 Connection Close
        //TODO: SQL 구문 정의
        String sqlQuery1 = "SELECT user_id , user_name , like_travel_place " +
                           " FROM users " +
                           " WHERE user_name = ?";

        //
        String sqlQuery2 = "SELECT ticket_type, departure_loc , arrival_loc, departure_at, return_at , total_price " +
                           "FROM airline_ticket " +
                           " WHERE departure_loc = '서울' AND ticket_type = '왕복' AND arrival_loc =? "+
                           " ORDER BY total_price";

        System.out.println("유저 이름을 입력해주세요.");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement preparedStatement1 = connection.prepareStatement(sqlQuery1);
             PreparedStatement preparedStatement2 = connection.prepareStatement(sqlQuery2);
        ) {



            preparedStatement1.setString(1, userName);
            ResultSet resultSet = preparedStatement1.executeQuery();

            String place = null;
            if(resultSet.next()){
                place = resultSet.getNString("like_travel_place");
            }
            System.out.println(place);
            //TODO: userName 으로 선호하는 곳 동적으로 질의하기

            Optional<String> likeTravelPlace = Optional.ofNullable(place);
            String likePlace = likeTravelPlace.orElseThrow(() -> new RuntimeException());
            System.out.println("선호하는 곳은 '" + likePlace + "'");

            //TODO: 얻어낸 'likePlace'로 항공권 동적으로 질의하기.
            preparedStatement2.setString(1, likePlace);

            ResultSet resultSet2 = preparedStatement2.executeQuery();

            while (resultSet2.next()){
                String ticketType = resultSet2.getNString("ticket_type");
                String departureLoc = resultSet2.getString("departure_loc");
                LocalDate departureAt = resultSet2.getDate("departure_at").toLocalDate();
                String arrivalLoc = resultSet2.getString("arrival_loc");
                LocalDate arrivalAt = resultSet2.getDate("return_at").toLocalDate();

                System.out.println("type: " + ticketType + ", 출발지: " + departureLoc + ", 도착지: " + arrivalLoc +
                        ", 출국 시간 : " + departureAt + ", 출국장소: " + arrivalAt);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}