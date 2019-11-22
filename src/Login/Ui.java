package Login;

import java.util.ArrayList;
import java.util.Scanner;

public class Ui {

    public enum Status{
        MENU, SIGNUP, LOGIN, USERS, EXIT
    }

    ArrayList<User> userinfo = new ArrayList<>();
    private String userid, passwd;

    Scanner scanner = new Scanner(System.in);

    public void showMenu(){
        System.out.println("========================================");
        System.out.println(
                "1. Sign Up\n"
                        +"2. Login\n"
                        +"3. Print All Users\n"
                        +"4. Exit"
        );
        System.out.println("========================================");

    }

    Status selectMenu() {
        System.out.print("번호를 입력하세오: ");
        int option = scanner.nextInt();
        scanner.nextLine(); //pass /r/n

        switch (option) {
            case 1:
                return Status.SIGNUP;
            case 2:
                return Status.LOGIN;
            case 3:
                return Status.USERS;
            case 4:
                return Status.EXIT;
            default:
                return Status.MENU;
        }
    }

    public void signUp(){
        System.out.print("Id: ");
        userid = scanner.nextLine();
        System.out.print("Password: ");
        passwd = scanner.nextLine();

        userinfo.add(new User(userid,passwd));
        System.out.println("\n등록되었습니다.");
        System.out.print("Press any key to continue ");
        scanner.nextLine();
    }

    public void login(){
        System.out.print("Id: ");
        userid = scanner.nextLine();
        System.out.print("Password: ");
        passwd = scanner.nextLine();

        for (int i = 0; i < User.count; i++){
            if(userid.equals(userinfo.get(i).getId()))
                if(passwd.equals(userinfo.get(i).getPasswd()))
                    System.out.println("로그인 되었습니다.");
                else
                    System.out.println("비밀번호가 틀렸습니다.");
            else if(i == User.count -1)
                System.out.println("입력하신 아이디는 존재하지 않습니다.");
        }
        System.out.print("Press any key to continue ");
        scanner.nextLine();
    }

    public void printUser(){
        for( int i = 0; i < userinfo.size(); i++)
            System.out.printf("{ %s, %s }\n", userinfo.get(i).getId(), userinfo.get(i).getPasswd());
        System.out.print("Press any key to continue ");
        scanner.nextLine();
    }

    public void exit(){
        System.out.println("프로그램 종료.");
    }

}
