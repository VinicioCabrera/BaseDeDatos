PGDMP     
         	            w            MiBaseDeDatos    11.4    11.4     �
           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false            �
           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false            �
           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                       false            �
           1262    16393    MiBaseDeDatos    DATABASE     �   CREATE DATABASE "MiBaseDeDatos" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Spanish_Ecuador.1252' LC_CTYPE = 'Spanish_Ecuador.1252';
    DROP DATABASE "MiBaseDeDatos";
             postgres    false            �            1259    16394    PERSONA    TABLE     �   CREATE TABLE public."PERSONA" (
    "PER_CEDULA" text NOT NULL,
    "PER_NOMBRES" text,
    "PER_APELLIDOS" text,
    "PER_EDAD" numeric(3,0),
    "PER_FECHA_NACIMIENTO" date,
    "PER_CELULAR" text,
    "PER_SALARIO" numeric(7,2)
);
    DROP TABLE public."PERSONA";
       public         postgres    false            �
          0    16394    PERSONA 
   TABLE DATA               �   COPY public."PERSONA" ("PER_CEDULA", "PER_NOMBRES", "PER_APELLIDOS", "PER_EDAD", "PER_FECHA_NACIMIENTO", "PER_CELULAR", "PER_SALARIO") FROM stdin;
    public       postgres    false    196   (       }
           2606    16401    PERSONA PERSONA_pkey 
   CONSTRAINT     `   ALTER TABLE ONLY public."PERSONA"
    ADD CONSTRAINT "PERSONA_pkey" PRIMARY KEY ("PER_CEDULA");
 B   ALTER TABLE ONLY public."PERSONA" DROP CONSTRAINT "PERSONA_pkey";
       public         postgres    false    196            �
   |   x�]��
�0���ɻ���-�ezA��)�݈���`��C��1�t�j��z0��ɖt<հ�=a�A7;%�������!)��ا[�M�BϦ���J�a�������������z�ι7��+�     