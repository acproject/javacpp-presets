// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * Kernel launch parameters
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUDA_LAUNCH_PARAMS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUDA_LAUNCH_PARAMS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUDA_LAUNCH_PARAMS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDA_LAUNCH_PARAMS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUDA_LAUNCH_PARAMS position(long position) {
        return (CUDA_LAUNCH_PARAMS)super.position(position);
    }
    @Override public CUDA_LAUNCH_PARAMS getPointer(long i) {
        return new CUDA_LAUNCH_PARAMS(this).position(position + i);
    }

    /** Kernel to launch */
    public native CUfunc_st function(); public native CUDA_LAUNCH_PARAMS function(CUfunc_st setter);
    /** Width of grid in blocks */
    public native @Cast("unsigned int") int gridDimX(); public native CUDA_LAUNCH_PARAMS gridDimX(int setter);
    /** Height of grid in blocks */
    public native @Cast("unsigned int") int gridDimY(); public native CUDA_LAUNCH_PARAMS gridDimY(int setter);
    /** Depth of grid in blocks */
    public native @Cast("unsigned int") int gridDimZ(); public native CUDA_LAUNCH_PARAMS gridDimZ(int setter);
    /** X dimension of each thread block */
    public native @Cast("unsigned int") int blockDimX(); public native CUDA_LAUNCH_PARAMS blockDimX(int setter);
    /** Y dimension of each thread block */
    public native @Cast("unsigned int") int blockDimY(); public native CUDA_LAUNCH_PARAMS blockDimY(int setter);
    /** Z dimension of each thread block */
    public native @Cast("unsigned int") int blockDimZ(); public native CUDA_LAUNCH_PARAMS blockDimZ(int setter);
    /** Dynamic shared-memory size per thread block in bytes */
    public native @Cast("unsigned int") int sharedMemBytes(); public native CUDA_LAUNCH_PARAMS sharedMemBytes(int setter);
    /** Stream identifier */
    public native CUstream_st hStream(); public native CUDA_LAUNCH_PARAMS hStream(CUstream_st setter);
    /** Array of pointers to kernel parameters */
    public native Pointer kernelParams(int i); public native CUDA_LAUNCH_PARAMS kernelParams(int i, Pointer setter);
    public native @Cast("void**") PointerPointer kernelParams(); public native CUDA_LAUNCH_PARAMS kernelParams(PointerPointer setter);
}
