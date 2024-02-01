package Del_1.Strings;

import java.util.Arrays;

public class Strings {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getNameParts("Ali Mohammad")));
        System.out.println(getFullName("Ali", "Haider", "Mohammad", "Shia"));
        System.out.println(capitalize("søReN oLeSEN JeNSEN"));
    }


    public static String[] getNameParts(String fullName) {
        String[] nameParts = fullName.split(" ");
        //Minimum størrelsen er 3.
        String[] result = new String[Math.max(nameParts.length, 3)];

        //Fornavn
        result[1] = nameParts[0];

        if (nameParts.length > 3) {
            for (int i = 2; i < result.length; i++) {
                result[i] = nameParts[i-1];
            }
            result[0] = nameParts[nameParts.length-1];

            return result;
        }

        //Efternavn
        result[0] = nameParts.length == 2 ? nameParts[1] : nameParts[2];
        //Mellemnavn
        result[2] = nameParts.length == 3 ? nameParts[1] : null;

        return result;
    }

    /*public static String getFullName(String lastName, String firstName) {
        *//*return firstName + " " + lastName;*//*
        return getFullName(lastName, firstName, null);
    }

    public static String getFullName(String lastName, String firstName, String middleName) {
        StringBuilder sb = new StringBuilder();
        sb.append(firstName).append(" ");

        if (middleName != null){
            sb.append(middleName).append(" ");
        }

        sb.append(lastName).append(" ");


        return sb.toString();
    }*/

    public static String getFullName(String... names) {
        StringBuilder sb = new StringBuilder();



        for (int i = 0; i < names.length; i++) {
            sb.append(names[i]);
            if (i != names.length-1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    public static String capitalize(String name) {
        String[] nameArr = name.split(" ");
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < nameArr.length; i++) {
            char firstLetter = Character.toUpperCase(nameArr[i].charAt(0));
            String restOfNameLowerCase = nameArr[i].substring(1).toLowerCase();

            sb.append(firstLetter).append(restOfNameLowerCase);

            if (i != nameArr.length-1) {
                sb.append(" ");
            }
        }

        String firstLetterUpperCase = name.substring(0,1).toUpperCase();

        return sb.toString();
    }
}
