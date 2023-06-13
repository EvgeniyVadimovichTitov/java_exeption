package model;

public class RepositoryFile implements Repository{
    private Mapply map;
    private FileOperation op;

    public RepositoryFile(Mapply map, FileOperation op) {
        this.map = map;
        this.op = op;
    }
    @Override
    public void save(Data data) {
        op.dataSave(map.map(data), data.getLastname());
    }
}
