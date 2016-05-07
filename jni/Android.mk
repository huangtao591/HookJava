LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := so
LOCAL_SRC_FILES := so.cpp

LOCAL_CFLAGS    := -I$(LOCAL_PATH)/include/ \
 -I$(LOCAL_PATH)/dalvik/vm/oo -I$(LOCAL_PATH)/dalvik/vm/ -I$(LOCAL_PATH)/dalvik/ \
   -DHAVE_LITTLE_ENDIAN

LOCAL_LDFLAGS	:=	-L$(LOCAL_PATH)/lib/  -L$(SYSROOT)/usr/lib -ldvm -llog -landroid_runtime


include $(BUILD_SHARED_LIBRARY)

