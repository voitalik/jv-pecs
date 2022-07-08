package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> machines = new ArrayList<>();
        if (type == Bulldozer.class) {
            machines = new BulldozerProducer().get();
            return machines;
        }
        if (type == Excavator.class) {
            machines = new ExcavatorProducer().get();
            return machines;
        }
        if (type == Truck.class) {
            machines = new TruckProducer().get();
            return machines;
        }
        return machines;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        int sizeList = machines.size();
        machines.clear();
        for (int i = 0; i < sizeList; i++) {
            machines.add(value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
