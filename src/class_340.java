
// $FF: renamed from: lp
public class class_340 extends class_339 {

   // $FF: renamed from: n boolean
   boolean field_3889;
   // $FF: renamed from: v boolean
   boolean field_3890;
   // $FF: renamed from: ap int
   public static final int field_3891 = 1;


   // $FF: renamed from: v (lp, int) int
   int method_6024(class_340 var1, int var2) {
      try {
         if(client.field_1413 * 1396273817 == this.field_3888 * 1693720149) {
            if(var2 != -1023710905) {
               throw new IllegalStateException();
            }

            if(1693720149 * var1.field_3888 != client.field_1413 * 1396273817) {
               return -1;
            }
         }

         if(var1.field_3888 * 1693720149 == client.field_1413 * 1396273817) {
            if(var2 != -1023710905) {
               throw new IllegalStateException();
            }

            if(1693720149 * this.field_3888 != 1396273817 * client.field_1413) {
               if(var2 != -1023710905) {
                  throw new IllegalStateException();
               }

               return 1;
            }
         }

         if(0 != 1693720149 * this.field_3888) {
            if(var2 != -1023710905) {
               throw new IllegalStateException();
            }

            if(1693720149 * var1.field_3888 == 0) {
               if(var2 != -1023710905) {
                  throw new IllegalStateException();
               }

               return -1;
            }
         }

         if(0 != var1.field_3888 * 1693720149 && 0 == this.field_3888 * 1693720149) {
            if(var2 != -1023710905) {
               throw new IllegalStateException();
            } else {
               return 1;
            }
         } else if(this.field_3890 && !var1.field_3890) {
            if(var2 != -1023710905) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            if(!this.field_3890) {
               if(var2 != -1023710905) {
                  throw new IllegalStateException();
               }

               if(var1.field_3890) {
                  return 1;
               }
            }

            if(this.field_3889) {
               if(var2 != -1023710905) {
                  throw new IllegalStateException();
               }

               if(!var1.field_3889) {
                  if(var2 != -1023710905) {
                     throw new IllegalStateException();
                  }

                  return -1;
               }
            }

            if(!this.field_3889) {
               if(var2 != -1023710905) {
                  throw new IllegalStateException();
               }

               if(var1.field_3889) {
                  if(var2 != -1023710905) {
                     throw new IllegalStateException();
                  }

                  return 1;
               }
            }

            if(1693720149 * this.field_3888 != 0) {
               if(var2 != -1023710905) {
                  throw new IllegalStateException();
               } else {
                  return -1023710905 * this.field_3885 - var1.field_3885 * -1023710905;
               }
            } else {
               return var1.field_3885 * -1023710905 - -1023710905 * this.field_3885;
            }
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: <init> () void
   class_340() {
      super();
      try {
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: n (lx, int) int
   public int method_6000(class_338 var1) {
      try {
         return this.method_6024((class_340)var1, -1023710905);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: b (lx) int
   public int method_6010(class_338 var1) {
      return this.method_6024((class_340)var1, -1023710905);
   }

   // $FF: renamed from: o (java.lang.Object) int
   public int method_6008(Object var1) {
      return this.method_6024((class_340)var1, -1023710905);
   }

   // $FF: renamed from: y (lp) int
   int method_6025(class_340 var1) {
      return client.field_1413 * 1396273817 == this.field_3888 * 1693720149 && 1693720149 * var1.field_3888 != client.field_1413 * 1396273817?-1:(var1.field_3888 * 1693720149 == client.field_1413 * 1396273817 && 1693720149 * this.field_3888 != 1396273817 * client.field_1413?1:(0 != 1693720149 * this.field_3888 && 1693720149 * var1.field_3888 == 0?-1:(0 != var1.field_3888 * 1693720149 && 0 == this.field_3888 * 1693720149?1:(this.field_3890 && !var1.field_3890?-1:(!this.field_3890 && var1.field_3890?1:(this.field_3889 && !var1.field_3889?-1:(!this.field_3889 && var1.field_3889?1:(1693720149 * this.field_3888 != 0?-1023710905 * this.field_3885 - var1.field_3885 * -1023710905:var1.field_3885 * -1023710905 - -1023710905 * this.field_3885))))))));
   }

   // $FF: renamed from: p (lp) int
   int method_6026(class_340 var1) {
      return client.field_1413 * 1396273817 == this.field_3888 * 1693720149 && 1693720149 * var1.field_3888 != client.field_1413 * 1396273817?-1:(var1.field_3888 * 1693720149 == client.field_1413 * 1396273817 && 1693720149 * this.field_3888 != 1396273817 * client.field_1413?1:(0 != 1693720149 * this.field_3888 && 1693720149 * var1.field_3888 == 0?-1:(0 != var1.field_3888 * 1693720149 && 0 == this.field_3888 * 1693720149?1:(this.field_3890 && !var1.field_3890?-1:(!this.field_3890 && var1.field_3890?1:(this.field_3889 && !var1.field_3889?-1:(!this.field_3889 && var1.field_3889?1:(1693720149 * this.field_3888 != 0?-1023710905 * this.field_3885 - var1.field_3885 * -1023710905:var1.field_3885 * -1023710905 - -1023710905 * this.field_3885))))))));
   }

   // $FF: renamed from: j (lx) int
   public int method_6002(class_338 var1) {
      return this.method_6024((class_340)var1, -1023710905);
   }

   // $FF: renamed from: r (lx) int
   public int method_6004(class_338 var1) {
      return this.method_6024((class_340)var1, -1023710905);
   }

   public int compareTo(Object var1) {
      try {
         return this.method_6024((class_340)var1, -1023710905);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: d (lx) int
   public int method_6006(class_338 var1) {
      return this.method_6024((class_340)var1, -1023710905);
   }

   // $FF: renamed from: s (java.lang.Object) int
   public int method_6005(Object var1) {
      return this.method_6024((class_340)var1, -1023710905);
   }

   // $FF: renamed from: f (lp) int
   int method_6027(class_340 var1) {
      return client.field_1413 * 1396273817 == this.field_3888 * 1693720149 && 1693720149 * var1.field_3888 != client.field_1413 * 1396273817?-1:(var1.field_3888 * -1930129332 == client.field_1413 * 1184654561 && -1125800213 * this.field_3888 != 1396273817 * client.field_1413?1:(0 != -155514453 * this.field_3888 && 1693720149 * var1.field_3888 == 0?-1:(0 != var1.field_3888 * 1693720149 && 0 == this.field_3888 * 1693720149?1:(this.field_3890 && !var1.field_3890?-1:(!this.field_3890 && var1.field_3890?1:(this.field_3889 && !var1.field_3889?-1:(!this.field_3889 && var1.field_3889?1:(1693720149 * this.field_3888 != 0?638089867 * this.field_3885 - var1.field_3885 * -1023710905:var1.field_3885 * -1023710905 - -850215675 * this.field_3885))))))));
   }

   // $FF: renamed from: l (java.lang.Object) int
   public int method_6007(Object var1) {
      return this.method_6024((class_340)var1, -1023710905);
   }

   // $FF: renamed from: u (java.lang.Object) int
   public int method_5995(Object var1) {
      return this.method_6024((class_340)var1, -1023710905);
   }
}
