public class Action {

    int number = 50;

    // Function - Method
    // void -> Geriye bir değer döndermeyen fonksiyon
    // parameters -> Fonksiyona gönderilen değişken, nesne, array vb. üyelerdir.
    // return -> Geriye fonksiyondan değişken, nesne, array vb. dönderen

    public void fncVoid() {
        String name = "Erkan";
        System.out.println(name);
    }


    public void fncParams( int num1, int num2 ) {
        int sum = num1 + num2;
        if (sum == 0) {

        }else {
            System.out.println("Sum: " + sum);
        }
    }

    public int minus( int num1, int num2 ) {
        int min = num1 - num2;
        return min;
    }

    public String[] arrUpperCase(String[] arrData) {
        for (int i = 0; i < arrData.length; i++) {
            String item = arrData[i];
            item = item.toUpperCase();
            arrData[i] = item;
        }
        return arrData;
    }

    public String addLines( String... arr ) {
        String datas = "";
        for (String item : arr) {
            datas += item + " ";
        }
        return datas;
    }

    public void fncObj( Profile profile ) {
        System.out.println( profile.userName() );
        profile.name = "Serkan Bilsin";
    }


    /**
     * @Autor <a href="mailto:ali@mail.com">Ali Bilmem<a/>
     * @implNote This line detail note
     * @See Profile
     * @param name (String)
     * @return Profile Class
     */
    public Profile fncChangeName( String name ) {
        Profile profile = new Profile();
        profile.name = name;
        return profile;
    }


}
