public abstract class UseCase<I, O> {
    public abstract void init(I i, O o);
    public abstract O execute(I i);
}
