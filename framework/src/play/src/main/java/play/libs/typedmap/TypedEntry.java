package play.libs.typedmap;

/**
 * An entry that binds a typed key and a value. These entries can be
 * placed into a {@link TypedMap} or any other type of object with typed
 * values.
 *
 * @param <A> The type of the key and value in this entry.
 */
public final class TypedEntry<A> {
    private final TypedKey<A> key;
    private final A value;

    public TypedEntry(TypedKey<A> key, A value) {
        this.key = key;
        this.value = value;
    }

    /**
     * Get the key part of this entry.
     */
    public TypedKey<A> key() {
        return key;
    }

    /**
     * Get the value part of this entry.
     */
    public A value() {
        return value;
    }
}
