public class Object {

    public Object() {}

    public boolean equals(Object obj) {
        return this == obj;
    }

    public String toString() {
        return getClass().getName() + '@' + Integer.toHexString(hashCode());
    }
    

    public int hashCode() {
        return System.identityHashCode(this);
    }


    /*
    protected Object clone() throws CloneNotSupportedException {
        if (this instanceof Cloneable)
           return VMObject.clone((Cloneable) this);
         throw new CloneNotSupportedException("Object not cloneable");
   }

    public final Class<? extends Object> getClass() {
        return VMObject.getClass(this);
    }

    public final void notify() throws IllegalMonitorStateException  {
     VMObject.notify(this);
    }

    public final void notifyAll() throws IllegalMonitorStateException {
    VMObject.notifyAll(this);
    }

     public final void wait() throws IllegalMonitorStateException, InterruptedException {
         VMObject.wait(this, 0, 0);
     }

    public final void wait(long ms) throws IllegalMonitorStateException, InterruptedException {
        wait(ms, 0);
    }

    public final void wait(long ms, int ns) throws IllegalMonitorStateException, InterruptedException {
            if (ms < 0 || ns < 0 || ns > 999999)
            throw new IllegalArgumentException("argument out of range");
            VMObject.wait(this, ms, ns);
    }
    */
}
