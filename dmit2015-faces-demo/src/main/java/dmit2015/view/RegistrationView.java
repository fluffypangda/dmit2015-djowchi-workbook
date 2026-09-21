package dmit2015.view;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped

public class RegistrationView {



    public String submit(){
        return "registration-success?faces-redirect=true";
        //return "registration-success"
        // by use this second one, it's title will stay "registration", not direct to "registration-success"
    }

}
