import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

// $FF: renamed from: dm
public class class_199 {

   // $FF: renamed from: c nf
   public static class_376 field_2341;
   // $FF: renamed from: n int
   public static final int field_2342 = 1048576;
   // $FF: renamed from: b java.lang.String
   public static final String field_2343 = "main_file_cache.idx";
   // $FF: renamed from: l nf
   public static class_376 field_2344;
   // $FF: renamed from: x int
   static final int field_2345 = 1;
   // $FF: renamed from: o nf
   public static class_376 field_2346;
   // $FF: renamed from: v int
   public static final int field_2347 = 1048576000;

   // $FF: renamed from: <clinit> () void
   static {
      field_2344 = null;
      field_2346 = null;
      field_2341 = null;
   }

   // $FF: renamed from: o () void
   public static void method_4023() {
      try {
         File var0 = new File(class_115.homeDirectory, "random.dat");
         class_376 var10000;
         RAFileHandle var10002;
         int var2;
         if(var0.exists()) {
            var10002 = new RAFileHandle(var0, "rw", 25L);
            var10000 = new class_376(var10002, 24, 0);
            field_2344 = var10000;
         } else {
            label31:
            for(int var1 = 0; var1 < class_292.field_3333.length; ++var1) {
               for(var2 = 0; var2 < class_48.cacheDirectories.length; ++var2) {
                  File var3 = new File(class_48.cacheDirectories[var2] + class_292.field_3333[var1] + File.separatorChar + "random.dat");
                  if(var3.exists()) {
                     var10002 = new RAFileHandle(var3, "rw", 25L);
                     var10000 = new class_376(var10002, 24, 0);
                     field_2344 = var10000;
                     break label31;
                  }
               }
            }
         }

         if(field_2344 == null) {
            RandomAccessFile var5 = new RandomAccessFile(var0, "rw");
            var2 = var5.read();
            var5.seek(0L);
            var5.write(var2);
            var5.seek(0L);
            var5.close();
            var10002 = new RAFileHandle(var0, "rw", 25L);
            var10000 = new class_376(var10002, 24, 0);
            field_2344 = var10000;
         }
      } catch (IOException var4) {
         ;
      }

   }

   // $FF: renamed from: r (java.lang.String, java.lang.String, int) java.io.File
   public static File method_4024(String var0, String var1, int var2) {
      String var3 = 0 == var2?"":"" + var2;
      class_396.field_4253 = new File(class_115.homeDirectory, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat");
      String var4 = null;
      String var5 = null;
      boolean var6 = false;
      Buffer var8;
      RAFileHandle var10000;
      File var20;
      Buffer var27;
      if(class_396.field_4253.exists()) {
         try {
            var10000 = new RAFileHandle(class_396.field_4253, "rw", 10000L);
            RAFileHandle var7 = var10000;
            var27 = new Buffer((int)var7.size());

            int var9;
            for(var8 = var27; var8.offset * -442398587 < var8.data.length; var8.offset += -1025691571 * var9) {
               var9 = var7.read(var8.data, -442398587 * var8.offset, var8.data.length - -442398587 * var8.offset, (byte)-30);
               if(var9 == -1) {
                  throw new IOException();
               }
            }

            var8.offset = 0;
            var9 = var8.readUnsignedByte();
            if(var9 < 1 || var9 > 3) {
               throw new IOException("" + var9);
            }

            int var10 = 0;
            if(var9 > 1) {
               var10 = var8.readUnsignedByte();
            }

            if(var9 <= 2) {
               var4 = var8.method_140((byte)91);
               if(var10 == 1) {
                  var5 = var8.method_140((byte)54);
               }
            } else {
               var4 = var8.method_141((byte)-82);
               if(var10 == 1) {
                  var5 = var8.method_141((byte)-20);
               }
            }

            var7.close();
         } catch (IOException var17) {
            var17.printStackTrace();
         }

         if(var4 != null) {
            var20 = new File(var4);
            if(!var20.exists()) {
               var4 = null;
            }
         }

         if(var4 != null) {
            var20 = new File(var4, "test.dat");
            if(!class_246.method_4711(var20, true, 1291812325)) {
               var4 = null;
            }
         }
      }

      if(var4 == null && var2 == 0) {
         label116:
         for(int var18 = 0; var18 < class_292.field_3333.length; ++var18) {
            for(int var21 = 0; var21 < class_48.cacheDirectories.length; ++var21) {
               File var22 = new File(class_48.cacheDirectories[var21] + class_292.field_3333[var18] + File.separatorChar + var0 + File.separatorChar);
               if(var22.exists() && class_246.method_4711(new File(var22, "test.dat"), true, -450028783)) {
                  var4 = var22.toString();
                  var6 = true;
                  break label116;
               }
            }
         }
      }

      if(null == var4) {
         var4 = class_115.homeDirectory + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
         var6 = true;
      }

      File var19;
      if(var5 != null) {
         var19 = new File(var5);
         var20 = new File(var4);

         try {
            File[] var23 = var19.listFiles();
            File[] var25 = var23;

            for(int var11 = 0; var11 < var25.length; ++var11) {
               File var12 = var25[var11];
               File var13 = new File(var20, var12.getName());
               boolean var14 = var12.renameTo(var13);
               if(!var14) {
                  throw new IOException();
               }
            }
         } catch (Exception var16) {
            var16.printStackTrace();
         }

         var6 = true;
      }

      if(var6) {
         var19 = new File(var4);

         try {
            var10000 = new RAFileHandle(class_396.field_4253, "rw", 10000L);
            RAFileHandle var24 = var10000;
            var27 = new Buffer(500);
            Buffer var26 = var27;
            var26.writeByte(3);
            var26.writeByte(0);
            var26.method_128(var19.getPath(), 499802318);

            var24.write(var26.data, 0, -2075038961 * var26.offset, (byte)-49);
            var24.close();
         } catch (IOException var15) {
            var15.printStackTrace();
         }
      }

      return new File(var4);
   }

   // $FF: renamed from: b (java.lang.String, java.lang.String, int) java.io.File
   public static File method_4025(String var0, String var1, int var2) {
      String var3 = 0 == var2?"":"" + var2;
      class_396.field_4253 = new File(class_115.homeDirectory, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat");
      String var4 = null;
      String var5 = null;
      boolean var6 = false;
      Buffer var8;
      RAFileHandle var10000;
      File var20;
      Buffer var27;
      if(class_396.field_4253.exists()) {
         try {
            var10000 = new RAFileHandle(class_396.field_4253, "rw", 10000L);
            RAFileHandle var7 = var10000;
            var27 = new Buffer((int)var7.size());

            int var9;
            for(var8 = var27; var8.offset * -442398587 < var8.data.length; var8.offset += -1025691571 * var9) {
               var9 = var7.read(var8.data, -442398587 * var8.offset, var8.data.length - -442398587 * var8.offset, (byte)-31);
               if(var9 == -1) {
                  throw new IOException();
               }
            }

            var8.offset = 0;
            var9 = var8.readUnsignedByte();
            if(var9 < 1 || var9 > 3) {
               throw new IOException("" + var9);
            }

            int var10 = 0;
            if(var9 > 1) {
               var10 = var8.readUnsignedByte();
            }

            if(var9 <= 2) {
               var4 = var8.method_140((byte)61);
               if(var10 == 1) {
                  var5 = var8.method_140((byte)103);
               }
            } else {
               var4 = var8.method_141((byte)3);
               if(var10 == 1) {
                  var5 = var8.method_141((byte)-50);
               }
            }

            var7.close();
         } catch (IOException var17) {
            var17.printStackTrace();
         }

         if(var4 != null) {
            var20 = new File(var4);
            if(!var20.exists()) {
               var4 = null;
            }
         }

         if(var4 != null) {
            var20 = new File(var4, "test.dat");
            if(!class_246.method_4711(var20, true, 1869046172)) {
               var4 = null;
            }
         }
      }

      if(var4 == null && var2 == 0) {
         label116:
         for(int var18 = 0; var18 < class_292.field_3333.length; ++var18) {
            for(int var21 = 0; var21 < class_48.cacheDirectories.length; ++var21) {
               File var22 = new File(class_48.cacheDirectories[var21] + class_292.field_3333[var18] + File.separatorChar + var0 + File.separatorChar);
               if(var22.exists() && class_246.method_4711(new File(var22, "test.dat"), true, 698254835)) {
                  var4 = var22.toString();
                  var6 = true;
                  break label116;
               }
            }
         }
      }

      if(null == var4) {
         var4 = class_115.homeDirectory + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
         var6 = true;
      }

      File var19;
      if(var5 != null) {
         var19 = new File(var5);
         var20 = new File(var4);

         try {
            File[] var23 = var19.listFiles();
            File[] var25 = var23;

            for(int var11 = 0; var11 < var25.length; ++var11) {
               File var12 = var25[var11];
               File var13 = new File(var20, var12.getName());
               boolean var14 = var12.renameTo(var13);
               if(!var14) {
                  throw new IOException();
               }
            }
         } catch (Exception var16) {
            var16.printStackTrace();
         }

         var6 = true;
      }

      if(var6) {
         var19 = new File(var4);

         try {
            var10000 = new RAFileHandle(class_396.field_4253, "rw", 10000L);
            RAFileHandle var24 = var10000;
            var27 = new Buffer(500);
            Buffer var26 = var27;
            var26.writeByte(3);
            var26.writeByte(0);
            var26.method_128(var19.getPath(), 499802318);

            var24.write(var26.data, 0, -442398587 * var26.offset, (byte)45);
            var24.close();
         } catch (IOException var15) {
            var15.printStackTrace();
         }
      }

      return new File(var4);
   }

   // $FF: renamed from: j (java.lang.String, java.lang.String, int) java.io.File
   public static File method_4026(String var0, String var1, int var2) {
      String var3 = 0 == var2?"":"" + var2;
      class_396.field_4253 = new File(class_115.homeDirectory, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat");
      String var4 = null;
      String var5 = null;
      boolean var6 = false;
      Buffer var8;
      RAFileHandle var10000;
      File var20;
      Buffer var27;
      if(class_396.field_4253.exists()) {
         try {
            var10000 = new RAFileHandle(class_396.field_4253, "rw", 10000L);
            RAFileHandle var7 = var10000;
            var27 = new Buffer((int)var7.size());

            int var9;
            for(var8 = var27; var8.offset * 1849884383 < var8.data.length; var8.offset += -1025691571 * var9) {
               var9 = var7.read(var8.data, -1791856301 * var8.offset, var8.data.length - -715313674 * var8.offset, (byte)-24);
               if(var9 == -1) {
                  throw new IOException();
               }
            }

            var8.offset = 0;
            var9 = var8.readUnsignedByte();
            if(var9 < 1 || var9 > 3) {
               throw new IOException("" + var9);
            }

            int var10 = 0;
            if(var9 > 1) {
               var10 = var8.readUnsignedByte();
            }

            if(var9 <= 2) {
               var4 = var8.method_140((byte)4);
               if(var10 == 1) {
                  var5 = var8.method_140((byte)27);
               }
            } else {
               var4 = var8.method_141((byte)-76);
               if(var10 == 1) {
                  var5 = var8.method_141((byte)26);
               }
            }

            var7.close();
         } catch (IOException var17) {
            var17.printStackTrace();
         }

         if(var4 != null) {
            var20 = new File(var4);
            if(!var20.exists()) {
               var4 = null;
            }
         }

         if(var4 != null) {
            var20 = new File(var4, "test.dat");
            if(!class_246.method_4711(var20, true, 1696853332)) {
               var4 = null;
            }
         }
      }

      if(var4 == null && var2 == 0) {
         label116:
         for(int var18 = 0; var18 < class_292.field_3333.length; ++var18) {
            for(int var21 = 0; var21 < class_48.cacheDirectories.length; ++var21) {
               File var22 = new File(class_48.cacheDirectories[var21] + class_292.field_3333[var18] + File.separatorChar + var0 + File.separatorChar);
               if(var22.exists() && class_246.method_4711(new File(var22, "test.dat"), true, 1705714449)) {
                  var4 = var22.toString();
                  var6 = true;
                  break label116;
               }
            }
         }
      }

      if(null == var4) {
         var4 = class_115.homeDirectory + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
         var6 = true;
      }

      File var19;
      if(var5 != null) {
         var19 = new File(var5);
         var20 = new File(var4);

         try {
            File[] var23 = var19.listFiles();
            File[] var25 = var23;

            for(int var11 = 0; var11 < var25.length; ++var11) {
               File var12 = var25[var11];
               File var13 = new File(var20, var12.getName());
               boolean var14 = var12.renameTo(var13);
               if(!var14) {
                  throw new IOException();
               }
            }
         } catch (Exception var16) {
            var16.printStackTrace();
         }

         var6 = true;
      }

      if(var6) {
         var19 = new File(var4);

         try {
            var10000 = new RAFileHandle(class_396.field_4253, "rw", 10000L);
            RAFileHandle var24 = var10000;
            var27 = new Buffer(500);
            Buffer var26 = var27;
            var26.writeByte(3);
            var26.writeByte(0);
            var26.writeByte(0);
            var26.method_128(var19.getPath(), 499802318);

            var24.write(var26.data, 0, -2065529096 * var26.offset, (byte)21);
            var24.close();
         } catch (IOException var15) {
            var15.printStackTrace();
         }
      }

      return new File(var4);
   }

   // $FF: renamed from: s (java.io.File, boolean) boolean
   public static boolean method_4027(File var0, boolean var1) {
      try {
         RandomAccessFile var2 = new RandomAccessFile(var0, "rw");
         int var3 = var2.read();
         var2.seek(0L);
         var2.write(var3);
         var2.seek(0L);
         var2.close();
         if(var1) {
            var0.delete();
         }

         return true;
      } catch (Exception var4) {
         return false;
      }
   }

   // $FF: renamed from: a () void
   public static void method_4028() {
      try {
         field_2346.method_6627();

         for(int var0 = 0; var0 < 264174683 * class_157.field_1958; ++var0) {
            class_164.field_2041[var0].method_6627();
         }

         field_2341.method_6627();
         field_2344.method_6627();
      } catch (Exception var1) {
         ;
      }

   }

   // $FF: renamed from: l (java.lang.String, java.lang.String, boolean) nm
   public static RAFileHandle method_4029(String var0, String var1, boolean var2) {
      File var3 = new File(class_53.fOldschoolCacheDir, "preferences" + var0 + ".dat");
      RAFileHandle var10000;
      if(var3.exists()) {
         try {
            var10000 = new RAFileHandle(var3, "rw", 10000L);
            RAFileHandle var10 = var10000;
            return var10;
         } catch (IOException var9) {
            ;
         }
      }

      String var4 = "";
      if(33 == class_184.field_2257 * -1166420103) {
         var4 = "_rc";
      } else if(34 == -1166420103 * class_184.field_2257) {
         var4 = "_wip";
      }

      File var5 = new File(class_115.homeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
      RAFileHandle var6;
      if(!var2 && var5.exists()) {
         try {
            var10000 = new RAFileHandle(var5, "rw", 10000L);
            var6 = var10000;
            return var6;
         } catch (IOException var8) {
            ;
         }
      }

      try {
         var10000 = new RAFileHandle(var3, "rw", 10000L);
         var6 = var10000;
         return var6;
      } catch (IOException var7) {
         throw new RuntimeException();
      }
   }

   // $FF: renamed from: e () void
   public static void method_4030() {
      try {
         File var0 = new File(class_115.homeDirectory, "random.dat");
         class_376 var10000;
         RAFileHandle var10002;
         int var2;
         if(var0.exists()) {
            var10002 = new RAFileHandle(var0, "rw", 25L);
            var10000 = new class_376(var10002, 24, 0);
            field_2344 = var10000;
         } else {
            label31:
            for(int var1 = 0; var1 < class_292.field_3333.length; ++var1) {
               for(var2 = 0; var2 < class_48.cacheDirectories.length; ++var2) {
                  File var3 = new File(class_48.cacheDirectories[var2] + class_292.field_3333[var1] + File.separatorChar + "random.dat");
                  if(var3.exists()) {
                     var10002 = new RAFileHandle(var3, "rw", 25L);
                     var10000 = new class_376(var10002, 24, 0);
                     field_2344 = var10000;
                     break label31;
                  }
               }
            }
         }

         if(field_2344 == null) {
            RandomAccessFile var5 = new RandomAccessFile(var0, "rw");
            var2 = var5.read();
            var5.seek(0L);
            var5.write(var2);
            var5.seek(0L);
            var5.close();
            var10002 = new RAFileHandle(var0, "rw", 25L);
            var10000 = new class_376(var10002, 24, 0);
            field_2344 = var10000;
         }
      } catch (IOException var4) {
         ;
      }

   }

   // $FF: renamed from: c () void
   public static void method_4031() {
      try {
         File var0 = new File(class_115.homeDirectory, "random.dat");
         class_376 var10000;
         RAFileHandle var10002;
         int var2;
         if(var0.exists()) {
            var10002 = new RAFileHandle(var0, "rw", 25L);
            var10000 = new class_376(var10002, 24, 0);
            field_2344 = var10000;
         } else {
            label31:
            for(int var1 = 0; var1 < class_292.field_3333.length; ++var1) {
               for(var2 = 0; var2 < class_48.cacheDirectories.length; ++var2) {
                  File var3 = new File(class_48.cacheDirectories[var2] + class_292.field_3333[var1] + File.separatorChar + "random.dat");
                  if(var3.exists()) {
                     var10002 = new RAFileHandle(var3, "rw", 25L);
                     var10000 = new class_376(var10002, 24, 0);
                     field_2344 = var10000;
                     break label31;
                  }
               }
            }
         }

         if(field_2344 == null) {
            RandomAccessFile var5 = new RandomAccessFile(var0, "rw");
            var2 = var5.read();
            var5.seek(0L);
            var5.write(var2);
            var5.seek(0L);
            var5.close();
            var10002 = new RAFileHandle(var0, "rw", 25L);
            var10000 = new class_376(var10002, 24, 0);
            field_2344 = var10000;
         }
      } catch (IOException var4) {
         ;
      }

   }

   // $FF: renamed from: <init> () void
   class_199() throws Throwable {
      super();
      try {
         throw new Error();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: g () void
   public static void method_4033() {
      try {
         field_2346.method_6627();

         for(int var0 = 0; var0 < 264174683 * class_157.field_1958; ++var0) {
            class_164.field_2041[var0].method_6627();
         }

         field_2341.method_6627();
         field_2344.method_6627();
      } catch (Exception var1) {
         ;
      }

   }

   // $FF: renamed from: d (java.io.File, boolean) boolean
   public static boolean method_4034(File var0, boolean var1) {
      try {
         RandomAccessFile var2 = new RandomAccessFile(var0, "rw");
         int var3 = var2.read();
         var2.seek(0L);
         var2.write(var3);
         var2.seek(0L);
         var2.close();
         if(var1) {
            var0.delete();
         }

         return true;
      } catch (Exception var4) {
         return false;
      }
   }

   // $FF: renamed from: iw (java.lang.String, io, byte) java.lang.String
   static String method_4035(String var0, class_37 var1, byte var2) {
      try {
         if(var0.indexOf("%") != -1) {
            if(var2 <= 0) {
               throw new IllegalStateException();
            }

            for(int var3 = 1; var3 <= 5; ++var3) {
               if(var2 <= 0) {
                  throw new IllegalStateException();
               }

               while(true) {
                  int var4 = var0.indexOf("%" + var3);
                  if(var4 == -1) {
                     if(var2 <= 0) {
                        throw new IllegalStateException();
                     }
                     break;
                  }

                  String var5 = var0.substring(0, var4);
                  int var7 = class_325.method_5780(var1, var3 - 1, 946945492);
                  String var6;
                  if(var7 < 999999999) {
                     if(var2 <= 0) {
                        throw new IllegalStateException();
                     }

                     var6 = Integer.toString(var7);
                  } else {
                     var6 = "*";
                  }

                  var0 = var5 + var6 + var0.substring(var4 + 2);
               }
            }
         }

         return var0;
      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8);
      }
   }
}
