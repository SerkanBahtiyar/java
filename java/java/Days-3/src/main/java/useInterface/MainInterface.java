package useInterface;

public class MainInterface {

    public static void main(String[] args) {

        UserImpl user = new UserImpl();
        IUser iUser = new UserImpl();
        IProfile iProfile = new UserImpl();

        call(user);
        call(iUser);

        IUser obj = new IUser() {
            @Override
            public boolean userLogin(String email, String password) {
                return false;
            }

            @Override
            public String userProfileName(int uid) {
                return null;
            }

            @Override
            public String userGetEmail(int uid) {
                return null;
            }
        };


    }

    public static void call( IUser iUser ) {
        if ( iUser instanceof UserImpl ) {
            UserImpl user = (UserImpl) iUser;
            user.userLogot(100);
        }
        iUser.userLogin("ali@mail.com", "12345");
    }

}
