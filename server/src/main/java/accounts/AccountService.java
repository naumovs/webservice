package accounts;

import java.util.HashMap;
import java.util.Map;

public class AccountService {
    public static Map<String, UserProfile> loginToProfile;
    public static Map<String, UserProfile> sessionIdToProfile;

    public AccountService() {
        loginToProfile = new HashMap<>();
        sessionIdToProfile = new HashMap<>();
    }

    public void addNewUser(UserProfile profile) {
        loginToProfile.put(profile.getLogin(), profile);
    }

    public void addSession(String sessionId, UserProfile profile) {
        sessionIdToProfile.put(sessionId, profile);
    }

    public UserProfile getUserByLogin(String login) {
        return loginToProfile.get(login);
    }

    public UserProfile getUserBySessionID(String sessionId) {
        return sessionIdToProfile.get(sessionId);
    }

    public void deleteSession(String sessionId) {
        sessionIdToProfile.remove(sessionId);
    }
}
