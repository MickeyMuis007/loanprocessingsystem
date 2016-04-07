package Factories;

import Services.User;
import Services.UserImpl.Consultant;
import Services.UserImpl.Manager;

/**
 * Created by student on 2016/04/07.
 */
public class UserFactory {
    static UserFactory sinlgeUserFactory = new UserFactory();
    private UserFactory(){

    }
    public User getUser(String user){
        if(user.equalsIgnoreCase("Manager"))
            return new Manager();
        else if(user.equalsIgnoreCase("Technician"))
            return new Consultant();
        else if(user.equalsIgnoreCase("Consultant"))
            return new Consultant();
        else
            return null;
    }
    public static UserFactory getInstance(){
        if(sinlgeUserFactory == null)
            return new UserFactory();
        return sinlgeUserFactory;
    }
}
