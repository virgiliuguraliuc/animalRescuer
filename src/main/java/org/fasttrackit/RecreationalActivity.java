package org.fasttrackit;

public class RecreationalActivity {
   private String RecreationalActivityName;
   private boolean fun;

    public RecreationalActivity(String recreationalActivityName) {
        RecreationalActivityName = recreationalActivityName;
    }

//getter

    public String getRecreationalActivityName() {
        return RecreationalActivityName;
    }

    public boolean isFun() {
        return fun;
    }

    //setter


    public void setRecreationalActivityName(String recreationalActivityName) {
        RecreationalActivityName = recreationalActivityName;
    }

    public void setFun(boolean fun) {
        this.fun = fun;
    }
}
