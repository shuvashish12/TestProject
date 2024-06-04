package strings;

public class StringClass1 {
    public static void main(String[] args) {
        String name = "Shuvashish";
        System.out.println(name);
        String name1 = "A";
        char char1='A';
        int num =9;
        //System.out.println(name.length());
//        System.out.println(name.toLowerCase());
//        System.out.println(name.toUpperCase());
//
//        System.out.println(name.charAt(3));
//        System.out.println(name.indexOf(""));
//
//        System.out.println(name.replace('a', 'i'));
//        System.out.println(name.replace("va", ".."));

        String[] countries = {"Bangladesh", "USA", "France", "India", "Italy"};
        String str = "Bangladesh, USA, France, India, Italy";
        String[] coutries2 = str.split(" ");
       // System.out.println(countries[2]);
        int sum = 0;

        //find total number of chars in the countries array
        for(int i =0; i<countries.length; i++){
            System.out.println(countries[i]);
            sum = sum+countries[i].length();
        }
        System.out.println(sum);
        // find total number of 'a' in the countries array
//        int count =0;
//        for(int i =0; i<countries.length; i++) {
//            String country = countries[i];
//            for(int j=0; j<country.length(); j++){
//                if(country.charAt(j)=='a'){
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);

        //print the name of the country which has the highest length
        int max = 0;
        int index = 0;
        for(int i =0; i<countries.length; i++) {
            if(countries[i].length()>max){
                max=countries[i].length();
                index =i;
            }
        }
        System.out.println(countries[index]);

        String city1 = "New York";
        String city2 = "New York";

       // if(city1 == city2){
        if(city1.equals(city2)){
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }

        //System.out.println(city1.contains("New"));
        System.out.println(city1.contains("york"));

        System.out.println(countries[1].charAt(1));
        //String[] countries = {"Bangladesh", "USA", "France", "India", "Italy"};
        System.out.println(countries[3].charAt(1));

    }
}
