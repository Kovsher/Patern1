package Taels;

//абстрактная

import jdk.nashorn.internal.runtime.regexp.joni.constants.StringType;

import java.util.Scanner;

public class Demo {
    private static Squadron getSquadron(String type) {
        Squadron squadron = null;
        SquadronFactory squadronFactory;
        switch (type) {
            case "Elf":
                squadronFactory = new ElfSquadronFactory();
                squadron = new Squadron(squadronFactory);
                break;
            case "Ork":
                System.out.println("Next to create ork");
                break;
            case "human":
                System.out.println("Next to create human");
                break;

        }
        return squadron;
    }

    public static void main(String[] args) {
        System.out.println("Enter type");
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        Squadron squadron = getSquadron (type);
        squadron.fight();
    }

}
