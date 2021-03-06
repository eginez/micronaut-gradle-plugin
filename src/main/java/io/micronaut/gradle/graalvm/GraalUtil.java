package io.micronaut.gradle.graalvm;

import java.util.Locale;

/**
 * Utilities for GraalVM.
 */
public final class GraalUtil {

    /**
     * @return Return whether the JVM in use a GraalVM JVM.
     */
    public static boolean isGraalJVM() {
        String vv = System.getProperty("java.vendor.version");
        return vv != null && vv.toLowerCase(Locale.ENGLISH).contains("graalvm");
    }
}
