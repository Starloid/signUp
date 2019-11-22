package Login;

public class UserTest {

    public static void main(String args[]){
        Ui ui = new Ui();
        Ui.Status step = Ui.Status.MENU;

        while(step == Ui.Status.MENU) {
            ui.showMenu();
            step = ui.selectMenu();
            if (step == Ui.Status.SIGNUP)
                ui.signUp();
            else if (step == Ui.Status.LOGIN)
                ui.login();
            else if (step == Ui.Status.USERS)
                ui.printUser();
            else if (step == Ui.Status.EXIT){
                ui.exit();
                break;
            }
            step = Ui.Status.MENU;
        }

    }
}
