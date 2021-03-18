public class Main {

    public static void main(String[] args) {
        String mesaj = "bugün hava çok güzel";
        System.out.println(mesaj);
        System.out.println(mesaj.length());

        System.out.println(mesaj.charAt(0));

        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf("h"));

        System.out.println(mesaj.startsWith("b"));
        System.out.println(mesaj.endsWith("l"));

        System.out.println(mesaj.concat("miş"));

        char[] karakterler = new char[6];

        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);

        System.out.println("----------------------------------------");

        System.out.println(mesaj.substring(5));
        System.out.println(mesaj.substring(5,10));

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());

        String yenimesaj = mesaj.replace(' ','-');
        System.out.println(yenimesaj);

        for(String kelime : mesaj.split(" ")) {

            System.out.println(kelime);
        }
        System.out.println(mesaj.trim());











    }
}
