// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_dataset;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

import static org.bytedeco.arrow.global.arrow_dataset.*;


/** \brief A DataSource consisting of a flat sequence of DataFragments */
@Namespace("arrow::dataset") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class SimpleDataSource extends DataSource {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SimpleDataSource(Pointer p) { super(p); }

  public SimpleDataSource(@SharedPtr DataFragment fragments) { super((Pointer)null); allocate(fragments); }
  private native void allocate(@SharedPtr DataFragment fragments);

  public native @ByVal DataFragmentIterator GetFragmentsImpl(@SharedPtr ScanOptions options);

  public native @StdString String type();
}