public class ExampleStaticKeyword {
    public static void main(String[] args) {

        //static = modifier. A single copy of a variable/method is created and shared.
        //         The class "owns" the static member

        Friend friend1 = new Friend("SponegBob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");
        Friend friend4 = new Friend("Bro");
        Friend friend5 = new Friend("Sandy");

        System.out.println(Friend.numberOfFriends);

        Friend.displayFriends();

    }
}

class Friend {
    String name;
    static int numberOfFriends;

    public Friend(String name) {

        this.name = name;
        numberOfFriends++;
    }

    static void displayFriends(){
        System.out.println("You have "+ numberOfFriends+" friends");
    }
}
