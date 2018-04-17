MY_LOCAL_PATH := $(call my-dir)

LOCAL_PATH := $(MY_LOCAL_PATH)
include $(LOCAL_PATH)/e2fsprogs/Android.mk

LOCAL_PATH := $(MY_LOCAL_PATH)
include $(CLEAR_VARS)
LOCAL_SRC_FILES := jni_main.cpp
LOCAL_MODULE := jni-main
LOCAL_C_INCLUDES := $(LOCAL_PATH)/e2fsprogs
LOCAL_STATIC_LIBRARIES := libext2_uuid_static
include $(BUILD_SHARED_LIBRARY)