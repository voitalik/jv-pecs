package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        List<Machine> list = new ArrayList<>();
        list.add(new Truck());
        list.add(new Truck());
        list.add(new Truck());
        return list;
    }
}
