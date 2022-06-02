package entities;

import java.util.ArrayList;
import java.util.List;

public class Disease {
    private List<String> symptom = new ArrayList<>();

    public Disease() {
    }

    public Disease(List<String> symptom) {
        this.symptom = symptom;
    }

}
