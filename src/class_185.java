
// $FF: renamed from: dt
public class class_185 extends class_181 {

   // $FF: renamed from: bt int
   static final int field_2258 = 1002;
   // $FF: renamed from: v boolean
   final boolean field_2259;
   // $FF: renamed from: c jf
   public static class_60 field_2260;
   // $FF: renamed from: sq jm
   static class_303 field_2261;


   // $FF: renamed from: j (lv, lv) int
   int method_3855(class_339 var1, class_339 var2) {
      return var1.field_3887 * -523203081 != var2.field_3887 * -523203081?(this.field_2259?-523203081 * var1.field_3887 - -523203081 * var2.field_3887:-523203081 * var2.field_3887 - -523203081 * var1.field_3887):this.method_3830(var1, var2, (byte)0);
   }

   // $FF: renamed from: v (lv, lv, byte) int
   int method_3856(class_339 var1, class_339 var2, byte var3) {
      try {
         if(var1.field_3887 * -523203081 != var2.field_3887 * -523203081) {
            if(var3 == 1) {
               throw new IllegalStateException();
            } else {
               int var10000;
               if(this.field_2259) {
                  if(var3 == 1) {
                     throw new IllegalStateException();
                  }

                  var10000 = -523203081 * var1.field_3887 - -523203081 * var2.field_3887;
               } else {
                  var10000 = -523203081 * var2.field_3887 - -523203081 * var1.field_3887;
               }

               return var10000;
            }
         } else {
            return this.method_3830(var1, var2, (byte)0);
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "dt.v(" + ')');
      }
   }

   // $FF: renamed from: <init> (boolean) void
   public void method_3857(boolean var1) {
      try {
         super.method_3822();
         this.field_2259 = var1;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "dt.<init>(" + ')');
      }
   }

   // $FF: renamed from: y (java.lang.Object, java.lang.Object) int
   public int method_3858(Object var1, Object var2) {
      return this.method_3856((class_339)var1, (class_339)var2, (byte)77);
   }

   // $FF: renamed from: p (java.lang.Object, java.lang.Object) int
   public int method_3859(Object var1, Object var2) {
      return this.method_3856((class_339)var1, (class_339)var2, (byte)-86);
   }

   // $FF: renamed from: n (lv, lv) int
   int method_3860(class_339 var1, class_339 var2) {
      return var1.field_3887 * 1309340417 != var2.field_3887 * -523203081?(this.field_2259?1066090790 * var1.field_3887 - -523203081 * var2.field_3887:-1273908135 * var2.field_3887 - -523203081 * var1.field_3887):this.method_3830(var1, var2, (byte)0);
   }

   // $FF: renamed from: f (lv, lv) int
   int method_3861(class_339 var1, class_339 var2) {
      return var1.field_3887 * 3336152 != var2.field_3887 * 633406255?(this.field_2259?-523203081 * var1.field_3887 - -523203081 * var2.field_3887:-523203081 * var2.field_3887 - 3061980 * var1.field_3887):this.method_3830(var1, var2, (byte)0);
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.method_3856((class_339)var1, (class_339)var2, (byte)17);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "dt.compare(" + ')');
      }
   }

   // $FF: renamed from: r (lv, lv) int
   int method_3862(class_339 var1, class_339 var2) {
      return var1.field_3887 * -523203081 != var2.field_3887 * -523203081?(this.field_2259?-523203081 * var1.field_3887 - -523203081 * var2.field_3887:-523203081 * var2.field_3887 - -523203081 * var1.field_3887):this.method_3830(var1, var2, (byte)0);
   }

   // $FF: renamed from: b (lv, lv) int
   int method_3863(class_339 var1, class_339 var2) {
      return var1.field_3887 * -58717704 != var2.field_3887 * -523203081?(this.field_2259?-523203081 * var1.field_3887 - 1458113586 * var2.field_3887:-523203081 * var2.field_3887 - -523203081 * var1.field_3887):this.method_3830(var1, var2, (byte)0);
   }

   // $FF: renamed from: v (java.lang.CharSequence[], int, int, int) java.lang.String
   public static String method_3864(CharSequence[] var0, int var1, int var2, int var3) {
      try {
         if(0 == var2) {
            return "";
         } else if(1 == var2) {
            if(var3 <= 2112901786) {
               throw new IllegalStateException();
            } else {
               CharSequence var10 = var0[var1];
               if(var10 == null) {
                  if(var3 <= 2112901786) {
                     throw new IllegalStateException();
                  } else {
                     return "null";
                  }
               } else {
                  return var10.toString();
               }
            }
         } else {
            int var4 = var2 + var1;
            int var5 = 0;

            for(int var6 = var1; var6 < var4; ++var6) {
               if(var3 <= 2112901786) {
                  throw new IllegalStateException();
               }

               CharSequence var7 = var0[var6];
               if(var7 == null) {
                  var5 += 4;
               } else {
                  var5 += var7.length();
               }
            }

            StringBuilder var11 = new StringBuilder(var5);

            for(int var12 = var1; var12 < var4; ++var12) {
               if(var3 <= 2112901786) {
                  throw new IllegalStateException();
               }

               CharSequence var8 = var0[var12];
               if(var8 == null) {
                  if(var3 <= 2112901786) {
                     throw new IllegalStateException();
                  }

                  var11.append("null");
               } else {
                  var11.append(var8);
               }
            }

            return var11.toString();
         }
      } catch (RuntimeException var9) {
         throw class_223.method_4281(var9, "dt.v(" + ')');
      }
   }
}
