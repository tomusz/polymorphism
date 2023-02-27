import java.security.InvalidParameterException;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import static java.util.Objects.isNull;

public class ObjectValidation {
    static Function<Mobile, String> isVehicle = object -> object instanceof Vehicle ?
            String.format(VehicleConstatnsProvider.getVehicleCheckTrueMsg(),
                    ((Vehicle) object).getMaxSpeed(),
                    ConstantsProvider.getSpeedUnitOfMeasure()) :
            VehicleConstatnsProvider.getVehicleCheckFalseMsg();
    static Consumer<Integer> isMobileObjectSpeedMoreThenZero = speed -> {
        if (speed < 1) throw new InvalidParameterException(ConstantsMsgProvider.getSpeedShouldNotBeLessThenOneMsg());
    };

    static Consumer<Object> isNotNull = object -> {
        if (isNull(object)) {
            throw new InvalidParameterException(ConstantsMsgProvider.getObjectShouldNotBeNullMsg());
        }
    };

    static Consumer<List<Object>> isNotEmpty = list -> {
        if (list.isEmpty()) {
            throw new InvalidParameterException(ConstantsMsgProvider.getListShouldNotBeEmptyMsg());
        }
    };
}
