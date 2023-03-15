package com.ngc.salesforceplaywright.playwrightngc.salesforceAPI;



public class IdAndClass<T extends SObjectBase> {
    private final String id;
    private final Class<T> clazz;

    public IdAndClass(String id, Class<T> clazz) {
        if (id == null || clazz == null)
            throw new RuntimeException("IdAndClass objects must have both id and clazz...");
        this.id = id;
        this.clazz = clazz;
    }

    public String getId() {
        return id;
    }

    public Class<T> getClazz() {
        return clazz;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        var other = (IdAndClass) obj;
        if (id == null) {
            return other.id == null;
        } else return id.equals(other.id);
    }

    @Override
    public String toString() {
        return "IdAndClass [id=" + id + ", clazz=" + clazz + "]";
    }

}
