/* public class isPalindrom {

    public boolean isPalindrom(String[] text1, String[] text2) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In convallis tellus ut felis eleifend, sed pulvinar augue gravida. Nulla commodo eleifend magna, quis maximus purus maximus et. Duis non nisl id tortor lobortis malesuada. Nunc et arcu vel turpis accumsan pharetra. Quisque aliquam hendrerit facilisis. Donec porta, justo eget ultricies convallis, nisl nisl vestibulum odio, cursus mollis diam erat eu lectus. Maecenas pulvinar nisl sit amet suscipit tincidunt. Ut maximus, dui vitae lacinia tincidunt, nisl orci mattis augue, non posuere ipsum neque eget nunc. Suspendisse euismod risus eu varius luctus. Etiam cursus maximus tellus eget condimentum.\n" +
                "\n" +
                "Morbi eu ultricies felis. Donec sit amet nisi eros. Aliquam hendrerit tincidunt quam eu maximus. Cras tempor ligula sed pellentesque blandit. Aenean aliquet augue nec massa sodales molestie. Integer erat purus, semper sit amet nunc sit amet, aliquam ultricies mauris. Duis placerat est ante, condimentum faucibus mi viverra non. Ut vulputate ultrices felis, eget cursus orci sollicitudin vel. Integer pulvinar finibus orci et sagittis. Ut porttitor magna ut tortor interdum iaculis. Aenean volutpat mollis dolor eget ornare. Sed mattis, elit a commodo aliquam, nisl dui sodales dui, ac fringilla lorem leo sit amet magna. Mauris molestie ligula non quam faucibus tempor. Proin finibus, mauris vel iaculis pharetra, mauris mi facilisis lectus, nec tincidunt mauris libero eget nulla. Fusce lobortis justo et lacus convallis fringilla. Curabitur eu elementum urna.";
        int zobacz = text.length();
        int zmienna = 0;
        int zmienna0 = zobacz - 1;
        while (zmienna < zmienna0) {
            char zmiennaChar = text.charAt(zmienna++);
            char zmiennaChar0 = text.charAt(zmienna0--);
            if (zmiennaChar != zmiennaChar0)
                return false;
        }
        return false;
    }

     public static void main(String[] args) {
         System.out.println(isPalindrom());
    }

    private static isPalindrom() {
        String text1 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In convallis tellus ut felis eleifend, sed pulvinar augue gravida. Nulla commodo eleifend magna, quis maximus purus maximus et. Duis non nisl id tortor lobortis malesuada. Nunc et arcu vel turpis accumsan pharetra. Quisque aliquam hendrerit facilisis. Donec porta, justo eget ultricies convallis, nisl nisl vestibulum odio, cursus mollis diam erat eu lectus. Maecenas pulvinar nisl sit amet suscipit tincidunt. Ut maximus, dui vitae lacinia tincidunt, nisl orci mattis augue, non posuere ipsum neque eget nunc. Suspendisse euismod risus eu varius luctus. Etiam cursus maximus tellus eget condimentum.\n" +
                "\n" +
                "Morbi eu ultricies felis. Donec sit amet nisi eros. Aliquam hendrerit tincidunt quam eu maximus. Cras tempor ligula sed pellentesque blandit. Aenean aliquet augue nec massa sodales molestie. Integer erat purus, semper sit amet nunc sit amet, aliquam ultricies mauris. Duis placerat est ante, condimentum faucibus mi viverra non. Ut vulputate ultrices felis, eget cursus orci sollicitudin vel. Integer pulvinar finibus orci et sagittis. Ut porttitor magna ut tortor interdum iaculis. Aenean volutpat mollis dolor eget ornare. Sed mattis, elit a commodo aliquam, nisl dui sodales dui, ac fringilla lorem leo sit amet magna. Mauris molestie ligula non quam faucibus tempor. Proin finibus, mauris vel iaculis pharetra, mauris mi facilisis lectus, nec tincidunt mauris libero eget nulla. Fusce lobortis justo et lacus convallis fringilla. Curabitur eu elementum urna.";

        int zobacz = text1.length();
        int zmienna = 0;
        int zmienna0 = zobacz - 1;
        while (zmienna < zmienna0) {
            char zmiennaChar = text1.charAt(zmienna++);
            char zmiennaChar0 = text1.charAt(zmienna0--);
            if (zmiennaChar != zmiennaChar0)
                return;
        }
    }
    }

*/