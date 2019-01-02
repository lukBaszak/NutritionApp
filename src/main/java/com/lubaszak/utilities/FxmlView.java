package com.lubaszak.utilities;

import java.util.ResourceBundle;

public enum FxmlView {

    USER {
        @Override
		public String getTitle() {
            return getStringFromResourceBundle("user.title");
        }

        @Override
		public String getFxmlFile() {
            return "/fxml/UserView.fxml";
        }
    }, 
    LOGIN {
        @Override
		public String getTitle() {
            return getStringFromResourceBundle("login.title");
        }

        @Override
		public String getFxmlFile() {
            return "/fxml/LoginView.fxml";
        }
    },
    REGISTER {
        @Override
        public String getTitle() {
            return getStringFromResourceBundle("register.title");
        }

        @Override
        public String getFxmlFile() {
            return "/fxml/RegisterView.fxml";
        }
    }
    ;
    
    public abstract String getTitle();
    public abstract String getFxmlFile();
    
    String getStringFromResourceBundle(String key){
        return ResourceBundle.getBundle("Bundle").getString(key);
    }

}