import java.awt.Font;

// $FF: renamed from: el
public class class_83 extends class_59 {

   // $FF: renamed from: y hz
   static class_272 field_770;
   // $FF: renamed from: l boolean
   public boolean field_771;
   // $FF: renamed from: p int
   public int field_772;
   // $FF: renamed from: qt int
   static final int field_773 = 512;
   // $FF: renamed from: r short[]
   short[] field_774;
   // $FF: renamed from: b short[]
   short[] field_775;
   // $FF: renamed from: ay int
   static final int field_776 = 50;
   // $FF: renamed from: s short[]
   short[] field_777;
   // $FF: renamed from: u int[]
   int[] field_778;
   // $FF: renamed from: j int[]
   int[] field_779;
   // $FF: renamed from: al java.awt.Font
   static Font field_780;
   // $FF: renamed from: d short[]
   short[] field_781;
   // $FF: renamed from: n jv
   static class_306 field_782;


   // $FF: renamed from: ar () void
   public static void method_1377() {
      field_770.method_5074();
   }

   // $FF: renamed from: f (nd, int) void
   void method_1378(class_28 var1, int var2) {
      try {
         while(true) {
            int var3 = var1.method_130();
            if(var3 == 0) {
               if(var2 <= -746072584) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.method_1392(var1, var3, -662659008);
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: p (int) boolean
   public boolean method_1379(int var1) {
      try {
         if(this.field_779 == null) {
            if(var1 != -2100349999) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            boolean var2 = true;

            for(int var3 = 0; var3 < this.field_779.length; ++var3) {
               if(var1 != -2100349999) {
                  throw new IllegalStateException();
               }

               if(!field_782.method_5383(this.field_779[var3], 0, (byte)97)) {
                  if(var1 != -2100349999) {
                     throw new IllegalStateException();
                  }

                  var2 = false;
               }
            }

            return var2;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: o (int) el
   public static class_83 method_1380(int var0) {
      class_83 var1 = (class_83)field_770.method_5065((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class_394.field_4247.method_5381(3, var0);
         class_83 var10000 = new class_83();
         var1 = var10000;
         if(var2 != null) {
            class_28 var10001 = new class_28(var2);
            var1.method_1378(var10001, 1950033998);
         }

         field_770.method_5064(var1, (long)var0);
         return var1;
      }
   }

   // $FF: renamed from: j (int) gm
   public class_93 method_1381(int var1) {
      try {
         if(this.field_779 == null) {
            if(var1 == 1294544848) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            class_93[] var2 = new class_93[this.field_779.length];

            for(int var3 = 0; var3 < this.field_779.length; ++var3) {
               if(var1 == 1294544848) {
                  throw new IllegalStateException();
               }

               var2[var3] = class_93.method_1708(field_782, this.field_779[var3], 0);
            }

            class_93 var6;
            if(1 == var2.length) {
               if(var1 == 1294544848) {
                  throw new IllegalStateException();
               }

               var6 = var2[0];
            } else {
               class_93 var10000 = new class_93(var2, var2.length);
               var6 = var10000;
            }

            int var4;
            if(this.field_774 != null) {
               if(var1 == 1294544848) {
                  throw new IllegalStateException();
               }

               for(var4 = 0; var4 < this.field_774.length; ++var4) {
                  if(var1 == 1294544848) {
                     throw new IllegalStateException();
                  }

                  var6.method_1703(this.field_774[var4], this.field_775[var4]);
               }
            }

            if(this.field_781 != null) {
               if(var1 == 1294544848) {
                  throw new IllegalStateException();
               }

               for(var4 = 0; var4 < this.field_781.length; ++var4) {
                  if(var1 == 1294544848) {
                     throw new IllegalStateException();
                  }

                  var6.method_1701(this.field_781[var4], this.field_777[var4]);
               }
            }

            return var6;
         }
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: a (nd) void
   void method_1382(class_28 var1) {
      while(true) {
         int var2 = var1.method_130();
         if(var2 == 0) {
            return;
         }

         this.method_1392(var1, var2, -662659008);
      }
   }

   // $FF: renamed from: b (int) gm
   public class_93 method_1383(int var1) {
      try {
         class_93[] var2 = new class_93[5];
         int var3 = 0;

         for(int var4 = 0; var4 < 5; ++var4) {
            if(var1 >= 1366362761) {
               throw new IllegalStateException();
            }

            if(this.field_778[var4] != -1) {
               if(var1 >= 1366362761) {
                  throw new IllegalStateException();
               }

               var2[var3++] = class_93.method_1708(field_782, this.field_778[var4], 0);
            }
         }

         class_93 var10000 = new class_93(var2, var3);
         class_93 var7 = var10000;
         int var5;
         if(null != this.field_774) {
            if(var1 >= 1366362761) {
               throw new IllegalStateException();
            }

            for(var5 = 0; var5 < this.field_774.length; ++var5) {
               if(var1 >= 1366362761) {
                  throw new IllegalStateException();
               }

               var7.method_1703(this.field_774[var5], this.field_775[var5]);
            }
         }

         if(null != this.field_781) {
            if(var1 >= 1366362761) {
               throw new IllegalStateException();
            }

            for(var5 = 0; var5 < this.field_781.length; ++var5) {
               if(var1 >= 1366362761) {
                  throw new IllegalStateException();
               }

               var7.method_1701(this.field_781[var5], this.field_777[var5]);
            }
         }

         return var7;
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      class_272 var10000 = new class_272(64);
      field_770 = var10000;
   }

   // $FF: renamed from: s (jv, jv) void
   public static void method_1385(class_306 var0, class_306 var1) {
      class_394.field_4247 = var0;
      field_782 = var1;
      class_271.field_3187 = class_394.field_4247.method_5393(3) * 376939071;
   }

   // $FF: renamed from: u (jv, jv) void
   public static void method_1386(class_306 var0, class_306 var1) {
      class_394.field_4247 = var0;
      field_782 = var1;
      class_271.field_3187 = class_394.field_4247.method_5393(3) * 376939071;
   }

   // $FF: renamed from: l (int) el
   public static class_83 method_1387(int var0) {
      class_83 var1 = (class_83)field_770.method_5065((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class_394.field_4247.method_5381(3, var0);
         class_83 var10000 = new class_83();
         var1 = var10000;
         if(var2 != null) {
            class_28 var10001 = new class_28(var2);
            var1.method_1378(var10001, -396855176);
         }

         field_770.method_5064(var1, (long)var0);
         return var1;
      }
   }

   // $FF: renamed from: r (int) boolean
   public boolean method_1388(int var1) {
      try {
         boolean var2 = true;

         for(int var3 = 0; var3 < 5; ++var3) {
            if(var1 == -1015060837) {
               throw new IllegalStateException();
            }

            if(-1 != this.field_778[var3] && !field_782.method_5383(this.field_778[var3], 0, (byte)27)) {
               if(var1 == -1015060837) {
                  throw new IllegalStateException();
               }

               var2 = false;
            }
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: g (nd) void
   void method_1389(class_28 var1) {
      while(true) {
         int var2 = var1.method_130();
         if(var2 == 0) {
            return;
         }

         this.method_1392(var1, var2, -662659008);
      }
   }

   // $FF: renamed from: al () gm
   public class_93 method_1390() {
      class_93[] var1 = new class_93[5];
      int var2 = 0;

      for(int var3 = 0; var3 < 5; ++var3) {
         if(this.field_778[var3] != -1) {
            var1[var2++] = class_93.method_1708(field_782, this.field_778[var3], 0);
         }
      }

      class_93 var10000 = new class_93(var1, var2);
      class_93 var5 = var10000;
      int var4;
      if(null != this.field_774) {
         for(var4 = 0; var4 < this.field_774.length; ++var4) {
            var5.method_1703(this.field_774[var4], this.field_775[var4]);
         }
      }

      if(null != this.field_781) {
         for(var4 = 0; var4 < this.field_781.length; ++var4) {
            var5.method_1701(this.field_781[var4], this.field_777[var4]);
         }
      }

      return var5;
   }

   // $FF: renamed from: lp (byte[], int, int) void
   static void method_1391(byte[] var0, int var1, int var2) {
      try {
         if(null == client.field_1457) {
            if(var2 >= 240874274) {
               throw new IllegalStateException();
            }

            client.field_1457 = new byte[24];
         }

         class_317.method_5619(var0, var1, client.field_1457, 0, 24);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: y (nd, int, int) void
   void method_1392(class_28 var1, int var2, int var3) {
      try {
         if(1 == var2) {
            this.field_772 = var1.method_130() * 1902278511;
         } else {
            int var4;
            int var5;
            if(var2 == 2) {
               var4 = var1.method_130();
               this.field_779 = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  if(var3 != -662659008) {
                     return;
                  }

                  this.field_779[var5] = var1.method_132();
               }
            } else if(var2 == 3) {
               if(var3 != -662659008) {
                  return;
               }

               this.field_771 = true;
            } else if(var2 == 40) {
               if(var3 != -662659008) {
                  throw new IllegalStateException();
               }

               var4 = var1.method_130();
               this.field_774 = new short[var4];
               this.field_775 = new short[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.field_774[var5] = (short)var1.method_132();
                  this.field_775[var5] = (short)var1.method_132();
               }
            } else if(var2 == 41) {
               if(var3 != -662659008) {
                  throw new IllegalStateException();
               }

               var4 = var1.method_130();
               this.field_781 = new short[var4];
               this.field_777 = new short[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  if(var3 != -662659008) {
                     throw new IllegalStateException();
                  }

                  this.field_781[var5] = (short)var1.method_132();
                  this.field_777[var5] = (short)var1.method_132();
               }
            } else if(var2 >= 60) {
               if(var3 != -662659008) {
                  throw new IllegalStateException();
               }

               if(var2 < 70) {
                  if(var3 != -662659008) {
                     return;
                  }

                  this.field_778[var2 - 60] = var1.method_132();
               }
            }
         }

      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: k (nd) void
   void method_1393(class_28 var1) {
      while(true) {
         int var2 = var1.method_130();
         if(var2 == 0) {
            return;
         }

         this.method_1392(var1, var2, -662659008);
      }
   }

   // $FF: renamed from: m (nd, int) void
   void method_1394(class_28 var1, int var2) {
      if(1 == var2) {
         this.field_772 = var1.method_130() * 1902278511;
      } else {
         int var3;
         int var4;
         if(var2 == 2) {
            var3 = var1.method_130();
            this.field_779 = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field_779[var4] = var1.method_132();
            }
         } else if(var2 == 3) {
            this.field_771 = true;
         } else if(var2 == 1406042306) {
            var3 = var1.method_130();
            this.field_774 = new short[var3];
            this.field_775 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field_774[var4] = (short)var1.method_132();
               this.field_775[var4] = (short)var1.method_132();
            }
         } else if(var2 == -328088248) {
            var3 = var1.method_130();
            this.field_781 = new short[var3];
            this.field_777 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field_781[var4] = (short)var1.method_132();
               this.field_777[var4] = (short)var1.method_132();
            }
         } else if(var2 >= -698855811 && var2 < 70) {
            this.field_778[var2 - 60] = var1.method_132();
         }
      }

   }

   // $FF: renamed from: x (nd, int) void
   void method_1395(class_28 var1, int var2) {
      if(1 == var2) {
         this.field_772 = var1.method_130() * -1185843983;
      } else {
         int var3;
         int var4;
         if(var2 == 2) {
            var3 = var1.method_130();
            this.field_779 = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field_779[var4] = var1.method_132();
            }
         } else if(var2 == 3) {
            this.field_771 = true;
         } else if(var2 == 2094005574) {
            var3 = var1.method_130();
            this.field_774 = new short[var3];
            this.field_775 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field_774[var4] = (short)var1.method_132();
               this.field_775[var4] = (short)var1.method_132();
            }
         } else if(var2 == 41) {
            var3 = var1.method_130();
            this.field_781 = new short[var3];
            this.field_777 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field_781[var4] = (short)var1.method_132();
               this.field_777[var4] = (short)var1.method_132();
            }
         } else if(var2 >= 60 && var2 < 70) {
            this.field_778[var2 - -114066046] = var1.method_132();
         }
      }

   }

   // $FF: renamed from: z (nd, int) void
   void method_1396(class_28 var1, int var2) {
      if(1 == var2) {
         this.field_772 = var1.method_130() * 1902278511;
      } else {
         int var3;
         int var4;
         if(var2 == 2) {
            var3 = var1.method_130();
            this.field_779 = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field_779[var4] = var1.method_132();
            }
         } else if(var2 == 3) {
            this.field_771 = true;
         } else if(var2 == 40) {
            var3 = var1.method_130();
            this.field_774 = new short[var3];
            this.field_775 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field_774[var4] = (short)var1.method_132();
               this.field_775[var4] = (short)var1.method_132();
            }
         } else if(var2 == 41) {
            var3 = var1.method_130();
            this.field_781 = new short[var3];
            this.field_777 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field_781[var4] = (short)var1.method_132();
               this.field_777[var4] = (short)var1.method_132();
            }
         } else if(var2 >= 60 && var2 < 70) {
            this.field_778[var2 - 60] = var1.method_132();
         }
      }

   }

   // $FF: renamed from: w () boolean
   public boolean method_1397() {
      if(this.field_779 == null) {
         return true;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.field_779.length; ++var2) {
            if(!field_782.method_5383(this.field_779[var2], 0, (byte)32)) {
               var1 = false;
            }
         }

         return var1;
      }
   }

   // $FF: renamed from: c (int) el
   public static class_83 method_1398(int var0) {
      class_83 var1 = (class_83)field_770.method_5065((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class_394.field_4247.method_5381(3, var0);
         class_83 var10000 = new class_83();
         var1 = var10000;
         if(var2 != null) {
            class_28 var10001 = new class_28(var2);
            var1.method_1378(var10001, 50446734);
         }

         field_770.method_5064(var1, (long)var0);
         return var1;
      }
   }

   // $FF: renamed from: h () boolean
   public boolean method_1399() {
      if(this.field_779 == null) {
         return true;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.field_779.length; ++var2) {
            if(!field_782.method_5383(this.field_779[var2], 0, (byte)50)) {
               var1 = false;
            }
         }

         return var1;
      }
   }

   // $FF: renamed from: q () gm
   public class_93 method_1400() {
      if(this.field_779 == null) {
         return null;
      } else {
         class_93[] var1 = new class_93[this.field_779.length];

         for(int var2 = 0; var2 < this.field_779.length; ++var2) {
            var1[var2] = class_93.method_1708(field_782, this.field_779[var2], 0);
         }

         class_93 var4;
         if(1 == var1.length) {
            var4 = var1[0];
         } else {
            class_93 var10000 = new class_93(var1, var1.length);
            var4 = var10000;
         }

         int var3;
         if(this.field_774 != null) {
            for(var3 = 0; var3 < this.field_774.length; ++var3) {
               var4.method_1703(this.field_774[var3], this.field_775[var3]);
            }
         }

         if(this.field_781 != null) {
            for(var3 = 0; var3 < this.field_781.length; ++var3) {
               var4.method_1701(this.field_781[var3], this.field_777[var3]);
            }
         }

         return var4;
      }
   }

   // $FF: renamed from: e (nd) void
   void method_1401(class_28 var1) {
      while(true) {
         int var2 = var1.method_130();
         if(var2 == 0) {
            return;
         }

         this.method_1392(var1, var2, -662659008);
      }
   }

   // $FF: renamed from: ae () boolean
   public boolean method_1402() {
      boolean var1 = true;

      for(int var2 = 0; var2 < 5; ++var2) {
         if(-1 != this.field_778[var2] && !field_782.method_5383(this.field_778[var2], 0, (byte)75)) {
            var1 = false;
         }
      }

      return var1;
   }

   // $FF: renamed from: ap () boolean
   public boolean method_1403() {
      boolean var1 = true;

      for(int var2 = 0; var2 < 5; ++var2) {
         if(-1 != this.field_778[var2] && !field_782.method_5383(this.field_778[var2], 0, (byte)96)) {
            var1 = false;
         }
      }

      return var1;
   }

   // $FF: renamed from: ab () gm
   public class_93 method_1404() {
      class_93[] var1 = new class_93[5];
      int var2 = 0;

      for(int var3 = 0; var3 < 5; ++var3) {
         if(this.field_778[var3] != -1) {
            var1[var2++] = class_93.method_1708(field_782, this.field_778[var3], 0);
         }
      }

      class_93 var10000 = new class_93(var1, var2);
      class_93 var5 = var10000;
      int var4;
      if(null != this.field_774) {
         for(var4 = 0; var4 < this.field_774.length; ++var4) {
            var5.method_1703(this.field_774[var4], this.field_775[var4]);
         }
      }

      if(null != this.field_781) {
         for(var4 = 0; var4 < this.field_781.length; ++var4) {
            var5.method_1701(this.field_781[var4], this.field_777[var4]);
         }
      }

      return var5;
   }

   // $FF: renamed from: i () boolean
   public boolean method_1405() {
      boolean var1 = true;

      for(int var2 = 0; var2 < 5; ++var2) {
         if(-1 != this.field_778[var2] && !field_782.method_5383(this.field_778[var2], 0, (byte)125)) {
            var1 = false;
         }
      }

      return var1;
   }

   // $FF: renamed from: ad () void
   public static void method_1406() {
      field_770.method_5074();
   }

   // $FF: renamed from: ai () void
   public static void method_1407() {
      field_770.method_5074();
   }

   // $FF: renamed from: t () boolean
   public boolean method_1408() {
      if(this.field_779 == null) {
         return true;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.field_779.length; ++var2) {
            if(!field_782.method_5383(this.field_779[var2], 0, (byte)107)) {
               var1 = false;
            }
         }

         return var1;
      }
   }

   // $FF: renamed from: <init> () void
   class_83() {
      super();
      try {
         this.field_772 = -1902278511;
         this.field_778 = new int[]{-1, -1, -1, -1, -1};
         this.field_771 = false;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: lc (java.lang.String, boolean, int) java.lang.String
   static String method_1409(String var0, boolean var1, int var2) {
      try {
         String var10000;
         if(var1) {
            if(var2 >= 779082810) {
               throw new IllegalStateException();
            }

            var10000 = "https://";
         } else {
            var10000 = "http://";
         }

         String var3 = var10000;
         if(client.field_1626 * 60643507 == 1) {
            if(var2 >= 779082810) {
               throw new IllegalStateException();
            }

            var0 = var0 + "-wtrc";
         } else if(60643507 * client.field_1626 == 2) {
            if(var2 >= 779082810) {
               throw new IllegalStateException();
            }

            var0 = var0 + "-wtqa";
         } else if(3 == client.field_1626 * 60643507) {
            if(var2 >= 779082810) {
               throw new IllegalStateException();
            }

            var0 = var0 + "-wtwip";
         } else if(5 == client.field_1626 * 60643507) {
            if(var2 >= 779082810) {
               throw new IllegalStateException();
            }

            var0 = var0 + "-wti";
         } else if(60643507 * client.field_1626 == 4) {
            if(var2 >= 779082810) {
               throw new IllegalStateException();
            }

            var0 = "local";
         }

         String var4 = "";
         if(class_371.field_4107 != null) {
            if(var2 >= 779082810) {
               throw new IllegalStateException();
            }

            var4 = "/p=" + class_371.field_4107;
         }

         String var5 = "runescape.com";
         return var3 + var0 + "." + var5 + "/l=" + class_387.field_4226 + "/a=" + class_90.field_909 * 1575006245 + var4 + "/";
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }
}
