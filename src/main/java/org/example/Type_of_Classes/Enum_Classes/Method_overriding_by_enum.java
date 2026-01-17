package org.example.Type_of_Classes.Enum_Classes;

public enum Method_overriding_by_enum {
    MONDAY{
        @Override
        public String type(){
            return "Monday";
        }
    },
    SATURDAY {
        @Override
        public String type() {
            return "Weekend";
        }
    },
    TUESDAY{
        @Override
        public String type() {
            return "TUESDAY";
        }
    };


    public abstract String type();
}
