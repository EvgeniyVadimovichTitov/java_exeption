package model;

public class Mapper implements Mapply{
    @Override
   public String map(Data data){
        return String.format("<%s><%s><%s><%s><%s><%s>",
                data.getLastname(), data.getName(), data.getSurname(),
                data.getBirthDate(), data.getPhone(), data.getGender());
    }
}
