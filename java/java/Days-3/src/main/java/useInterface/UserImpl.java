package useInterface;

public class UserImpl implements IUser, IProfile {

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

    @Override
    public String userProfileImagePath(int uid) {
        return null;
    }

    @Override
    public boolean userLogot(int uid) {
        return false;
    }
}
