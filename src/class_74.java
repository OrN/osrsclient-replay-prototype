
// $FF: renamed from: ex
public class class_74 extends class_59 {

   // $FF: renamed from: n int
   public static int field_591;
   // $FF: renamed from: rr int
   static int field_592;
   // $FF: renamed from: f hz
   public static class_272 field_593;
   // $FF: renamed from: v jv
   static class_306 field_594;
   // $FF: renamed from: j int
   static final int field_595 = 70;
   // $FF: renamed from: ae int
   static final int field_596 = 28;
   // $FF: renamed from: y int
   public int field_597;


   // $FF: renamed from: u (nd) void
   void method_1118(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method_1120(var1, var2, -513513603);
      }
   }

   // $FF: renamed from: f (nd, int) void
   void method_1119(Buffer var1, int var2) {
      try {
         while(true) {
            int var3 = var1.readUnsignedByte();
            if(var3 == 0) {
               if(var2 == 578289169) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.method_1120(var1, var3, 1230881703);
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: y (nd, int, int) void
   void method_1120(Buffer var1, int var2, int var3) {
      try {
         if(var2 == 5) {
            if(var3 == 1115122599) {
               throw new IllegalStateException();
            }

            this.field_597 = var1.readShort() * -823376161;
         }

      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      class_272 var10000 = new class_272(64);
      field_593 = var10000;
   }

   // $FF: renamed from: p (jv) void
   public static void method_1122(class_306 var0) {
      field_594 = var0;
      field_591 = field_594.method_5393(16) * -1720246611;
   }

   // $FF: renamed from: <init> () void
   class_74() {
      super();
      try {
         this.field_597 = 0;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: r (int) ex
   public static class_74 method_1123(int var0) {
      class_74 var1 = (class_74)field_593.method_5065((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = field_594.method_5381(16, var0);
         class_74 var10000 = new class_74();
         var1 = var10000;
         if(var2 != null) {
            Buffer var10001 = new Buffer(var2);
            var1.method_1119(var10001, -2017757030);
         }

         field_593.method_5064(var1, (long)var0);
         return var1;
      }
   }

   // $FF: renamed from: s (nd) void
   void method_1124(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method_1120(var1, var2, 106981521);
      }
   }

   // $FF: renamed from: d (int) ex
   public static class_74 method_1125(int var0) {
      class_74 var1 = (class_74)field_593.method_5065((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = field_594.method_5381(16, var0);
         class_74 var10000 = new class_74();
         var1 = var10000;
         if(var2 != null) {
            Buffer var10001 = new Buffer(var2);
            var1.method_1119(var10001, 1314405663);
         }

         field_593.method_5064(var1, (long)var0);
         return var1;
      }
   }

   // $FF: renamed from: b (int) ex
   public static class_74 method_1126(int var0) {
      class_74 var1 = (class_74)field_593.method_5065((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = field_594.method_5381(16, var0);
         class_74 var10000 = new class_74();
         var1 = var10000;
         if(var2 != null) {
            Buffer var10001 = new Buffer(var2);
            var1.method_1119(var10001, 557723241);
         }

         field_593.method_5064(var1, (long)var0);
         return var1;
      }
   }

   // $FF: renamed from: j (jv) void
   public static void method_1127(class_306 var0) {
      field_594 = var0;
      field_591 = field_594.method_5393(16) * -1912773777;
   }

   // $FF: renamed from: k (int, cf, boolean, int) int
   static int method_1128(int var0, int var3) {
      try {
         class_37 var4 = class_71.method_1047(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885]);
         if(2500 == var0) {
            class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = var4.field_114 * 1347538309;
            return 1;
         } else if(2501 == var0) {
            if(var3 == -1416522410) {
               throw new IllegalStateException();
            } else {
               class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = -2036682047 * var4.field_115;
               return 1;
            }
         } else if(2502 == var0) {
            if(var3 == -1416522410) {
               throw new IllegalStateException();
            } else {
               class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = var4.field_104 * 1163271639;
               return 1;
            }
         } else if(2503 == var0) {
            class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = -571887853 * var4.field_117;
            return 1;
         } else if(var0 == 2504) {
            if(var3 == -1416522410) {
               throw new IllegalStateException();
            } else {
               class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = var4.field_121?1:0;
               return 1;
            }
         } else if(var0 == 2505) {
            class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = -1338646279 * var4.field_152;
            return 1;
         } else {
            return 2;
         }
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: p (long) int
   public static int method_1129(long var0) {
      try {
         return (int)(var0 >>> 0 & 127L);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }
}
