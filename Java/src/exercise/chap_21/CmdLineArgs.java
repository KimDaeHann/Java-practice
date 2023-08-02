package exercise.chap_21;

public class CmdLineArgs {
    public static void main(String[] args) {
        //args


        System.out.println(args.length);

        System.out.printf("첫 번째 인자는 :s%\n",args[0]);
        System.out.printf("두 번째 인자는: s%\n",args[1]);
    }
}
