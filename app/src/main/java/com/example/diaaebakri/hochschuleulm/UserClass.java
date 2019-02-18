package com.example.diaaebakri.hochschuleulm;

import java.util.ArrayList;
import java.util.List;

public class UserClass {

        private String field;
        private String value;
        
        public UserClass(String field, String value){
            this.field = field;
            this.value = value;
        }

        public String getField() {
            return field;
        }

        public String getValue(){
            return value;
        }

        public static UserClass[] fieldArr = {
                new UserClass("First Name", "Diaae"),
                new UserClass("Last Name", "Bakri"),
                new UserClass("Email", "bakrik@webmail.hs-ulm.de"),
                new UserClass("Account Type", "Student"),
                new UserClass("Matrikel-Nr", "3126821"),
                new UserClass("Date of Birth", "19.08.1994"),
                new UserClass("Degree Type", "Bachelor"),
                new UserClass("Course", "Computer Science"),
                new UserClass("Semester", "3")
        };
        public static List<UserClass> fieldList(){
            List<UserClass> res = new ArrayList<>();
            for(UserClass x : fieldArr){
                res.add(x);
            }
            return res;
        }
    }


