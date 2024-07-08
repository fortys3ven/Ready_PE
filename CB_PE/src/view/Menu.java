package view;

import controller.Utils;
import java.util.ArrayList;
import java.util.List;

public abstract class Menu {

    private String Type;
    private ArrayList<String> choices;

    protected Menu(String type, String[] choices) {
        this.Type = type;
        this.choices = new ArrayList<>();
        this.choices.addAll(List.of(choices));
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public ArrayList<String> getChoices() {
        return choices;
    }

    public void setChoices(ArrayList<String> choices) {
        this.choices = choices;
    }

    public void displayMenu() {
        System.out.print("\n");
        System.out.println(Type);
        System.out.println("__________________________");
        for (int i = 0; i < choices.size() - 1; i++) {
            System.out.println((i + 1) + "." + choices.get(i));
        }
        System.out.println(0 + "." + choices.getLast());
        System.out.println("__________________________");
    }

    public int getSelected() {
        while (true) {
            try {
                displayMenu();
                int choice = Utils.getValueInt("Enter your choice: ");
                if (choice >= 0 && choice <= 3) {
                    return choice;
                }
            } catch (Exception e) {
                System.out.println("Invalid, Please enter again: ");
            }
        }
    }

    public abstract void execute(int n);

    public void run() {
        while (true) {
            int choice = getSelected();
            if (choice == 0) {
                execute(0);
                break;
            } else if (choice > 0 && choice <= choices.size()) {
                execute(choice);
            } else {
                System.out.println("Not Valid! Please enter again.");
                execute(choice);
            }
        }
    }
}
