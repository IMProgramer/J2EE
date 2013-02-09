package com.example.model;
import java.util.*;
public class Adviser {
public List getadv(String type) {
List adv = new ArrayList();
if (type.equals("Story")) {
adv.add("Resident Evil 4");
adv.add("Dishonored");
adv.add("Far Cry 2");
}
else {
adv.add("Battlefield 3");
adv.add("Call of Duty black ops");
}
return(adv);
}
}