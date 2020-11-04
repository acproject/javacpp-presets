// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;
 /* while(0) */

/**
* Types which allow static initialization of "half" and "half2" until
* these become an actual builtin. Note this initialization is as a
* bitfield representation of "half", and not a conversion from short->half.
* Such a representation will be deprecated in a future version of CUDA. 
* (Note these are visible to non-nvcc compilers, including C-only compilation)
*/
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class __half_raw extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public __half_raw() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public __half_raw(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public __half_raw(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public __half_raw position(long position) {
        return (__half_raw)super.position(position);
    }
    @Override public __half_raw getPointer(long i) {
        return new __half_raw(this).position(position + i);
    }

    public native @Cast("unsigned short") short x(); public native __half_raw x(short setter);
}
