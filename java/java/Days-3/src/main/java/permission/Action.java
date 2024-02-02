package permission;

class Action {

    // private -> sadece sınıfın içinde görünebilme
    private String name = "Ali";

    final String surname = "Bilmem";

    public String connection() {
        System.out.println( Profile.city );
        return name;
    }

}
