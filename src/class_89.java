import java.util.LinkedHashMap;

// $FF: renamed from: ee
public class class_89 extends class_59 {

   // $FF: renamed from: j int[]
   static final int[] field_892;
   // $FF: renamed from: n hz
   public static class_272 field_893;
   // $FF: renamed from: f int
   public int field_894;
   // $FF: renamed from: p int
   public int field_895;
   // $FF: renamed from: y int
   public int field_896;
   // $FF: renamed from: v jv
   public static class_306 field_897;
   // $FF: renamed from: l short[][]
   public static short[][] field_898;


   // $FF: renamed from: f (nd, int) void
   public void method_1569(Buffer var1) {
      try {
         while(true) {
            int var3 = var1.readUnsignedByte();
            if(var3 == 0) {
               return;
            }

            this.method_1580(var1, var3);
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      class_272 var10000 = new class_272(64);
      field_893 = var10000;
      field_892 = new int[32];
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         field_892[var1] = var0 - 1;
         var0 += var0;
      }

   }

   // $FF: renamed from: fh (int) void
   static final void method_1575(int var0) {
      try {
         if(class_112.field_1274) {
            if(var0 >= -497630910) {
               throw new IllegalStateException();
            }

            for(int var1 = 0; var1 < -1143549299 * class_195.field_2313; ++var1) {
               if(var0 >= -497630910) {
                  throw new IllegalStateException();
               }

               class_100 var2 = client.field_1605[class_195.field_2318[var1]];
               var2.method_1863();
            }

            class_112.field_1274 = false;
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: fj (boolean, byte) void
   static final void method_1578(boolean var0, byte var1) {
      try {
         class_202 var10000;
         if(var0) {
            if(class_177.field_2203) {
               if(var1 == 0) {
                  throw new IllegalStateException();
               }

               var10000 = class_202.field_2363;
            } else {
               var10000 = class_202.field_2365;
            }

            client.field_1452 = var10000;
         } else {
            LinkedHashMap var2 = class_87.preferences.field_2126;
            String var4 = class_177.email;
            int var5 = var4.length();
            int var6 = 0;

            for(int var7 = 0; var7 < var5; ++var7) {
               if(var1 == 0) {
                  throw new IllegalStateException();
               }

               var6 = (var6 << 5) - var6 + var4.charAt(var7);
            }

            if(var2.containsKey(Integer.valueOf(var6))) {
               if(var1 == 0) {
                  throw new IllegalStateException();
               }

               var10000 = class_202.field_2364;
            } else {
               var10000 = class_202.field_2362;
            }

            client.field_1452 = var10000;
         }

      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8);
      }
   }

   // $FF: renamed from: y (nd, int, int) void
   void method_1580(Buffer var1, int var2) {
      try {
         if(1 == var2) {
            this.field_894 = var1.readShort() * 1658468423;
            this.field_896 = var1.readUnsignedByte() * 138764379;
            this.field_895 = var1.readUnsignedByte() * -670060269;
         }

      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: <init> () void
   public class_89() {
      super();
   }

   // $FF: renamed from: e (int) void
   static void method_1588(int var0) {
      try {
         if(class_154.method_3251()) {
            if(var0 != -1858038859) {
               throw new IllegalStateException();
            }

            class_177.field_2202 = true;
            class_177.field_2195 = 0;
            class_177.field_2193 = 0;
         }

      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }
}
