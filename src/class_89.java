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


   // $FF: renamed from: d (int) ee
   public static class_89 method_1568(int var0) {
      class_89 var1 = (class_89)field_893.method_5065((long)var0);
      if(null != var1) {
         return var1;
      } else {
         byte[] var2 = field_897.method_5381(14, var0);
         class_89 var10000 = new class_89();
         var1 = var10000;
         if(var2 != null) {
            class_28 var10001 = new class_28(var2);
            var1.method_1569(var10001);
         }

         field_893.method_5064(var1, (long)var0);
         return var1;
      }
   }

   // $FF: renamed from: f (nd, int) void
   public void method_1569(class_28 var1) {
      try {
         while(true) {
            int var3 = var1.method_130();
            if(var3 == 0) {
               return;
            }

            this.method_1580(var1, var3);
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: s (int) ee
   public static class_89 method_1570(int var0) {
      class_89 var1 = (class_89)field_893.method_5065((long)var0);
      if(null != var1) {
         return var1;
      } else {
         byte[] var2 = field_897.method_5381(14, var0);
         class_89 var10000 = new class_89();
         var1 = var10000;
         if(var2 != null) {
            class_28 var10001 = new class_28(var2);
            var1.method_1569(var10001);
         }

         field_893.method_5064(var1, (long)var0);
         return var1;
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

   // $FF: renamed from: j (jv) void
   public static void method_1572(class_306 var0) {
      field_897 = var0;
   }

   // $FF: renamed from: c (nd, int) void
   void method_1573(class_28 var1, int var2) {
      if(1 == var2) {
         this.field_894 = var1.method_132() * 1658468423;
         this.field_896 = var1.method_130() * 138764379;
         this.field_895 = var1.method_130() * -670060269;
      }

   }

   // $FF: renamed from: b (jv) void
   public static void method_1574(class_306 var0) {
      field_897 = var0;
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

   // $FF: renamed from: r (jv) void
   public static void method_1576(class_306 var0) {
      field_897 = var0;
   }

   // $FF: renamed from: u (nd) void
   public void method_1577(class_28 var1) {
      while(true) {
         int var2 = var1.method_130();
         if(var2 == 0) {
            return;
         }

         this.method_1580(var1, var2);
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
            LinkedHashMap var2 = class_87.field_852.field_2126;
            String var4 = class_177.field_2200;
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

   // $FF: renamed from: o (nd) void
   public void method_1579(class_28 var1) {
      while(true) {
         int var2 = var1.method_130();
         if(var2 == 0) {
            return;
         }

         this.method_1580(var1, var2);
      }
   }

   // $FF: renamed from: y (nd, int, int) void
   void method_1580(class_28 var1, int var2) {
      try {
         if(1 == var2) {
            this.field_894 = var1.method_132() * 1658468423;
            this.field_896 = var1.method_130() * 138764379;
            this.field_895 = var1.method_130() * -670060269;
         }

      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: e (nd, int) void
   void method_1581(class_28 var1, int var2) {
      if(1 == var2) {
         this.field_894 = var1.method_132() * 236848204;
         this.field_896 = var1.method_130() * 138764379;
         this.field_895 = var1.method_130() * -670060269;
      }

   }

   // $FF: renamed from: m () void
   public static void method_1582() {
      field_893.method_5074();
   }

   // $FF: renamed from: a () void
   public static void method_1583() {
      field_893.method_5074();
   }

   // $FF: renamed from: k () void
   public static void method_1584() {
      field_893.method_5074();
   }

   // $FF: renamed from: l (nd) void
   public void method_1585(class_28 var1) {
      while(true) {
         int var2 = var1.method_130();
         if(var2 == 0) {
            return;
         }

         this.method_1580(var1, var2);
      }
   }

   // $FF: renamed from: x () void
   public static void method_1586() {
      field_893.method_5074();
   }

   // $FF: renamed from: <init> () void
   public class_89() {
      super();
   }

   // $FF: renamed from: g (nd, int) void
   void method_1587(class_28 var1, int var2) {
      if(1 == var2) {
         this.field_894 = var1.method_132() * -1619307514;
         this.field_896 = var1.method_130() * 623464285;
         this.field_895 = var1.method_130() * -2118186650;
      }

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
