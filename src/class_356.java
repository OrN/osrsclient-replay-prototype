
// $FF: renamed from: lr
public class class_356 {

   // $FF: renamed from: v int
   public static final int field_3968 = 2;
   // $FF: renamed from: f int
   public static final int field_3969 = 8;
   // $FF: renamed from: y int
   public static final int field_3970 = 32;
   // $FF: renamed from: s int
   public static final int field_3971 = 8192;
   // $FF: renamed from: ap int
   static final int field_3972 = 0;
   // $FF: renamed from: b int
   public static final int field_3973 = 128;
   // $FF: renamed from: j int
   public static final int field_3974 = 1;
   // $FF: renamed from: c int
   public static final int field_3975 = 32;
   // $FF: renamed from: p int
   public static final int field_3976 = 16;
   // $FF: renamed from: g int
   public static final int field_3977 = 16;


   // $FF: renamed from: <init> () void
   class_356() throws Throwable {
      super();
      try {
         throw new Error();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: p (int, cf, boolean, byte) int
   static int method_6243(int var0, boolean var2, byte var3) {
      try {
         int var4 = -1;
         class_37 var5;
         if(var0 >= 2000) {
            if(var3 >= 5) {
               throw new IllegalStateException();
            }

            var0 -= 1000;
            var4 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
            var5 = class_71.method_1047(var4);
         } else {
            class_37 var10000;
            if(var2) {
               if(var3 >= 5) {
                  throw new IllegalStateException();
               }

               var10000 = class_124.field_1357;
            } else {
               var10000 = class_165.field_2064;
            }

            var5 = var10000;
         }

         if(var0 == 1000) {
            if(var3 >= 5) {
               throw new IllegalStateException();
            } else {
               class_136.field_1752 -= -55941620;
               var5.field_159 = class_165.field_2052[-26460885 * class_136.field_1752] * -616256129;
               var5.field_111 = -1598442445 * class_165.field_2052[-26460885 * class_136.field_1752 + 1];
               var5.field_106 = 557706273 * class_165.field_2052[-26460885 * class_136.field_1752 + 2];
               var5.field_107 = class_165.field_2052[class_136.field_1752 * -26460885 + 3] * -1722594515;
               class_254.method_4900(var5, (byte)65);
               class_121.field_1337.method_2462(var5, 1326950718);
               if(-1 != var4 && 1659206769 * var5.field_103 == 0) {
                  if(var3 >= 5) {
                     throw new IllegalStateException();
                  }

                  class_352.method_6231(class_37.field_93[var4 >> 16], var5, false);
               }

               return 1;
            }
         } else if(1001 == var0) {
            if(var3 >= 5) {
               throw new IllegalStateException();
            } else {
               class_136.field_1752 -= -55941620;
               var5.field_112 = class_165.field_2052[-26460885 * class_136.field_1752] * -112425541;
               var5.field_113 = class_165.field_2052[class_136.field_1752 * -26460885 + 1] * 1681689769;
               var5.field_108 = class_165.field_2052[class_136.field_1752 * -26460885 + 2] * 923552651;
               var5.field_109 = class_165.field_2052[3 + -26460885 * class_136.field_1752] * -1264602799;
               class_254.method_4900(var5, (byte)93);
               class_121.field_1337.method_2462(var5, 951646487);
               if(var4 != -1) {
                  if(var3 >= 5) {
                     throw new IllegalStateException();
                  }

                  if(0 == var5.field_103 * 1659206769) {
                     if(var3 >= 5) {
                        throw new IllegalStateException();
                     }

                     class_352.method_6231(class_37.field_93[var4 >> 16], var5, false);
                  }
               }

               return 1;
            }
         } else if(1003 == var0) {
            if(var3 >= 5) {
               throw new IllegalStateException();
            } else {
               boolean var6 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1;
               if(var5.field_121 != var6) {
                  if(var3 >= 5) {
                     throw new IllegalStateException();
                  }

                  var5.field_121 = var6;
                  class_254.method_4900(var5, (byte)94);
               }

               return 1;
            }
         } else {
            boolean var10001;
            if(var0 == 1005) {
               if(var3 >= 5) {
                  throw new IllegalStateException();
               } else {
                  if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                     if(var3 >= 5) {
                        throw new IllegalStateException();
                     }

                     var10001 = true;
                  } else {
                     var10001 = false;
                  }

                  var5.field_243 = var10001;
                  return 1;
               }
            } else if(1006 == var0) {
               if(var3 >= 5) {
                  throw new IllegalStateException();
               } else {
                  if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                     if(var3 >= 5) {
                        throw new IllegalStateException();
                     }

                     var10001 = true;
                  } else {
                     var10001 = false;
                  }

                  var5.field_244 = var10001;
                  return 1;
               }
            } else {
               return 2;
            }
         }
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7);
      }
   }
}
