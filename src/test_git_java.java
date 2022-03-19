import java.text.SimpleDateFormat;
import java.util.Date;

public class test_git_java {
    public static void main(String[] args) {
        SimpleDateFormat formmatchik = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println(formmatchik.format(new Date()));
        System.out.println("change something for check");
        System.out.println("it's for checking git update");
        System.out.println("it's only for conflict in git versions from 2.8");
        System.out.println("git checkout -b branch_name creates new branch and connect to the new branch");
        System.out.println("git branch , to check branches");
    }
}
