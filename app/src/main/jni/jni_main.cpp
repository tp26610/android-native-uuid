#include <jni.h>

#include <stdio.h>
#include "uuid/uuid.h"

// generate UUID example.
int main(int argc, char **argv)
{
    uuid_t uuid = {0};
    char str[36];

    uuid_generate(uuid);
    uuid_unparse(uuid, str);

    printf("%s\n", str);

    return 0;
}

extern "C" {

JNIEXPORT jstring JNICALL Java_jni_NativeUUID_generateUUID(JNIEnv *env, jobject jobj) {
    uuid_t uuid = {0};
    char str[36];

    uuid_generate(uuid);
    uuid_unparse(uuid, str);

    return env->NewStringUTF(str);
}

} // extern "C"