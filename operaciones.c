#include<stdio.h>
#include"jni.h"
#include"tarea1.h"

JNIEXPORT jint JNICALL Java_tarea1_suma (JNIEnv *env, jobject obj, jint num1, jint num2) {

	int resultado = num1 + num2; 
	return resultado; 

}

JNIEXPORT jint JNICALL Java_tarea1_multiplicacion (JNIEnv *env, jobject obj, jint num1, jint num2){

	int resultado = num1 * num2; 
	return resultado; 

}

JNIEXPORT jint JNICALL Java_tarea1_resta (JNIEnv *env, jobject obj, jint num1, jint num2){

	int resultado = num1 - num2; 
	return resultado; 

}

JNIEXPORT jint JNICALL Java_tarea1_division (JNIEnv *env, jobject obj, jint num1, jint num2){

	int resultado = num1 / num2; 
	return resultado; 

}