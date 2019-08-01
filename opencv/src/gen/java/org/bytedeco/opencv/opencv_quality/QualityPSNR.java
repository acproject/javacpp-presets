// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_quality;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import org.bytedeco.opencv.opencv_ml.*;
import static org.bytedeco.opencv.global.opencv_ml.*;

import static org.bytedeco.opencv.global.opencv_quality.*;


/**
\brief Full reference peak signal to noise ratio (PSNR) algorithm  https://en.wikipedia.org/wiki/Peak_signal-to-noise_ratio
*/
@Namespace("cv::quality") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_quality.class)
public class QualityPSNR extends QualityBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QualityPSNR(Pointer p) { super(p); }


    /** \brief Default maximum pixel value */
// #if __cplusplus >= 201103L || (defined(_MSC_VER) && _MSC_VER >= 1900/*MSVS 2015*/)
    @MemberGetter public static native double MAX_PIXEL_VALUE_DEFAULT();
    public static final double MAX_PIXEL_VALUE_DEFAULT = MAX_PIXEL_VALUE_DEFAULT();
// #else
    // support MSVS 2013
// #endif

    /**
    \brief Create an object which calculates quality
    @param ref input image to use as the source for comparison
    @param maxPixelValue maximum per-channel value for any individual pixel; eg 255 for uint8 image
    */
    public static native @Ptr QualityPSNR create( @ByVal Mat ref, double maxPixelValue/*=cv::quality::QualityPSNR::MAX_PIXEL_VALUE_DEFAULT*/ );
    public static native @Ptr QualityPSNR create( @ByVal Mat ref );
    public static native @Ptr QualityPSNR create( @ByVal UMat ref, double maxPixelValue/*=cv::quality::QualityPSNR::MAX_PIXEL_VALUE_DEFAULT*/ );
    public static native @Ptr QualityPSNR create( @ByVal UMat ref );
    public static native @Ptr QualityPSNR create( @ByVal GpuMat ref, double maxPixelValue/*=cv::quality::QualityPSNR::MAX_PIXEL_VALUE_DEFAULT*/ );
    public static native @Ptr QualityPSNR create( @ByVal GpuMat ref );

    /**
    \brief Compute the PSNR
    @param cmp Comparison image
    @return Per-channel PSNR value, or std::numeric_limits<double>::infinity() if the MSE between the two images == 0
    */
    public native @ByVal @Override Scalar compute( @ByVal Mat cmp );
    public native @ByVal @Override Scalar compute( @ByVal UMat cmp );
    public native @ByVal @Override Scalar compute( @ByVal GpuMat cmp );

    /** \brief Implements Algorithm::empty()  */
    public native @Cast("bool") @Override boolean empty();

    /** \brief Implements Algorithm::clear()  */
    public native @Override void clear();

    /**
    \brief static method for computing quality
    @param ref reference image
    @param cmp comparison image
    @param qualityMap output quality map, or cv::noArray()
    @param maxPixelValue maximum per-channel value for any individual pixel; eg 255 for uint8 image
    @return PSNR value, or std::numeric_limits<double>::infinity() if the MSE between the two images == 0
    */
    public static native @ByVal Scalar compute( @ByVal Mat ref, @ByVal Mat cmp, @ByVal Mat qualityMap, double maxPixelValue/*=cv::quality::QualityPSNR::MAX_PIXEL_VALUE_DEFAULT*/);
    public static native @ByVal Scalar compute( @ByVal Mat ref, @ByVal Mat cmp, @ByVal Mat qualityMap);
    public static native @ByVal Scalar compute( @ByVal UMat ref, @ByVal UMat cmp, @ByVal UMat qualityMap, double maxPixelValue/*=cv::quality::QualityPSNR::MAX_PIXEL_VALUE_DEFAULT*/);
    public static native @ByVal Scalar compute( @ByVal UMat ref, @ByVal UMat cmp, @ByVal UMat qualityMap);
    public static native @ByVal Scalar compute( @ByVal GpuMat ref, @ByVal GpuMat cmp, @ByVal GpuMat qualityMap, double maxPixelValue/*=cv::quality::QualityPSNR::MAX_PIXEL_VALUE_DEFAULT*/);
    public static native @ByVal Scalar compute( @ByVal GpuMat ref, @ByVal GpuMat cmp, @ByVal GpuMat qualityMap);

    /** \brief return the maximum pixel value used for PSNR computation */
    public native double getMaxPixelValue();

    /**
    \brief sets the maximum pixel value used for PSNR computation
    @param val Maximum pixel value
    */
    public native void setMaxPixelValue(double val);

}