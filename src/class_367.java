
// $FF: renamed from: ml
public abstract class class_367 implements class_9 {

   // $FF: renamed from: v np
   class_385 field_4095;


   // $FF: renamed from: d () java.lang.Object
   Object method_6567() {
      return this.field_4095 == class_385.field_4218?Integer.valueOf(0):(this.field_4095 == class_385.field_4215?Long.valueOf(-1L):(class_385.field_4216 == this.field_4095?"":null));
   }

   // $FF: renamed from: f (nd, int) void
   public void method_6568(class_28 var1, int var2) {
      try {
         while(true) {
            int var3 = var1.method_130(1587715266);
            if(var3 == 0) {
               if(var2 <= -1688948348) {
                  throw new IllegalStateException();
               }

               return;
            }

            class_365 var4 = (class_365)class_197.method_4016(class_248.method_4718(-71321726), var3, -611336247);
            if(var4 != null) {
               if(var2 <= -1688948348) {
                  return;
               }

               switch(1709225651 * var4.field_4088) {
               case 0:
                  class_197.method_4016(class_291.method_5294(1808084531), var1.method_130(-22504539), -611336247);
                  break;
               case 1:
                  int var5 = var1.method_130(57125216);
                  int var7 = class_391.field_4245[var5];
                  class_385 var6;
                  if(var7 == 1) {
                     var6 = class_385.field_4218;
                  } else if(var7 == 2) {
                     if(var2 <= -1688948348) {
                        throw new IllegalStateException();
                     }

                     var6 = class_385.field_4216;
                  } else if(3 == var7) {
                     if(var2 <= -1688948348) {
                        throw new IllegalStateException();
                     }

                     var6 = class_385.field_4215;
                  } else {
                     var6 = null;
                  }

                  this.field_4095 = var6;
                  if(null != this.field_4095) {
                     break;
                  }

                  if(var2 <= -1688948348) {
                     throw new IllegalStateException();
                  }

                  throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
               case 2:
                  var1.method_140((byte)119);
                  break;
               default:
                  throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
               }
            } else {
               this.method_6569(var1, var3, -1773936298);
            }
         }
      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8, "ml.f(" + ')');
      }
   }

   // $FF: renamed from: v (nd, int, int) void
   abstract void method_6569(class_28 var1, int var2, int var3);

   // $FF: renamed from: u () java.lang.Object
   Object method_6570() {
      return this.field_4095 == class_385.field_4218?Integer.valueOf(0):(this.field_4095 == class_385.field_4215?Long.valueOf(-1L):(class_385.field_4216 == this.field_4095?"":null));
   }

   // $FF: renamed from: p (int) java.lang.Object
   Object method_6571(int var1) {
      try {
         if(this.field_4095 == class_385.field_4218) {
            if(var1 >= 845336023) {
               throw new IllegalStateException();
            } else {
               return Integer.valueOf(0);
            }
         } else if(this.field_4095 == class_385.field_4215) {
            return Long.valueOf(-1L);
         } else if(class_385.field_4216 == this.field_4095) {
            if(var1 >= 845336023) {
               throw new IllegalStateException();
            } else {
               return "";
            }
         } else {
            return null;
         }
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "ml.p(" + ')');
      }
   }

   // $FF: renamed from: n (nd, int) void
   abstract void method_6572(class_28 var1, int var2);

   // $FF: renamed from: y (int) boolean
   boolean method_6573(int var1) {
      try {
         boolean var10000;
         if(null != this.field_4095) {
            if(var1 != -1118376221) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "ml.y(" + ')');
      }
   }

   // $FF: renamed from: r (nd) void
   public void method_6574(class_28 var1) {
      while(true) {
         int var2 = var1.method_130(108565058);
         if(var2 == 0) {
            return;
         }

         class_365 var3 = (class_365)class_197.method_4016(class_248.method_4718(-71321726), var2, -611336247);
         if(var3 != null) {
            switch(1709225651 * var3.field_4088) {
            case 0:
               class_197.method_4016(class_291.method_5294(1808084531), var1.method_130(638152195), -611336247);
               break;
            case 1:
               int var4 = var1.method_130(-2085859619);
               int var6 = class_391.field_4245[var4];
               class_385 var5;
               if(var6 == 1) {
                  var5 = class_385.field_4218;
               } else if(var6 == 2) {
                  var5 = class_385.field_4216;
               } else if(3 == var6) {
                  var5 = class_385.field_4215;
               } else {
                  var5 = null;
               }

               this.field_4095 = var5;
               if(null != this.field_4095) {
                  break;
               }

               throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var4);
            case 2:
               var1.method_140((byte)4);
               break;
            default:
               throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
            }
         } else {
            this.method_6569(var1, var2, -1971093943);
         }
      }
   }

   // $FF: renamed from: b () boolean
   boolean method_6575() {
      return null != this.field_4095;
   }

   // $FF: renamed from: p (int, int, int, int) int
   public static int method_6576(int var0, int var1, int var2, int var3) {
      try {
         int var4 = class_240.method_4644(var2 - var1 + 1, 483795177);
         var4 <<= var1;
         var0 |= var4;
         return var0;
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5, "ml.p(" + ')');
      }
   }

   // $FF: renamed from: s () java.lang.Object
   Object method_6577() {
      return this.field_4095 == class_385.field_4218?Integer.valueOf(0):(this.field_4095 == class_385.field_4215?Long.valueOf(-1L):(class_385.field_4216 == this.field_4095?"":null));
   }

   // $FF: renamed from: <init> (int) void
   void method_6578(int var1) {
      try {
         super();
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "ml.<init>(" + ')');
      }
   }

   // $FF: renamed from: j (nd) void
   public void method_6579(class_28 var1) {
      while(true) {
         int var2 = var1.method_130(-1822262350);
         if(var2 == 0) {
            return;
         }

         class_365 var3 = (class_365)class_197.method_4016(class_248.method_4718(-71321726), var2, -611336247);
         if(var3 != null) {
            switch(1709225651 * var3.field_4088) {
            case 0:
               class_197.method_4016(class_291.method_5294(1808084531), var1.method_130(1704310792), -611336247);
               break;
            case 1:
               int var4 = var1.method_130(-1768134059);
               int var6 = class_391.field_4245[var4];
               class_385 var5;
               if(var6 == 1) {
                  var5 = class_385.field_4218;
               } else if(var6 == 2) {
                  var5 = class_385.field_4216;
               } else if(3 == var6) {
                  var5 = class_385.field_4215;
               } else {
                  var5 = null;
               }

               this.field_4095 = var5;
               if(null != this.field_4095) {
                  break;
               }

               throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var4);
            case 2:
               var1.method_140((byte)32);
               break;
            default:
               throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
            }
         } else {
            this.method_6569(var1, var2, -401213150);
         }
      }
   }
}
