package app.nakanishi.daiki.caliculator

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.nakanishi.daiki.caliculator.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    //1番目に入力される変数を作る
    var firstNumber = 0

    //二番目に入力される変数を作る
    var secondNumber = 0

    //合計を入れる変数を作る
    var totalNumber = 0
    //符号の入力状態を持つ変数を最初は空で作る
    var operator = "empty"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply { setContentView(this.root) }

        //画面起動時は符号ボタンと等号ボタンを灰色にする
        binding.plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150, 150, 150))
        binding.minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150, 150, 150))
        binding.multiplyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150, 150, 150))
        binding.equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150, 150, 150))

        //画面起動時は符号ボタンと等号ボタンを利用できないようにする
        binding.plusButton.isEnabled = false
        binding.minusButton.isEnabled = false
        binding.multiplyButton.isEnabled = false
        binding.equalButton.isEnabled = false

        //1番目に入力される変数をTextViewに表示する
        binding.numberText.text = firstNumber.toString()




        //ボタン０がタップされたら
        binding.numberButton0.setOnClickListener {
            //符号の入力状態を持つ変数がemptyかそうでないかで処理を分ける
            if (operator == "empty") {
                //1番目に入力された数字を10倍して0を＋
                firstNumber = firstNumber * 10 + 0

                //数字を表示するTextviewに反映する
                binding.numberText.text = firstNumber.toString()

                //+ - ×ボタンを黄色にする
                binding.plusButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 0))
                binding.minusButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 0))
                binding.multiplyButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 0))
                //符号ボタンと等号ボタンを利用できるようにする
                binding.plusButton.isEnabled = true
                binding.minusButton.isEnabled = true
                binding.multiplyButton.isEnabled = true
                binding.equalButton.isEnabled = true

                binding.textView.text = firstNumber.toString()
            } else {
                //二番目に入力された数字を10倍して1を足し算する
                secondNumber = secondNumber * 10 + 0

                //数字を表示するTextViewに表示する
                binding.numberText.text = secondNumber.toString()
                //等号ボタンを黄色にする
                binding.equalButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 240))

                if (operator == "plus") {
                    binding.textView.text = firstNumber.toString() + "+" + secondNumber.toString()
                } else if (operator == "minus") {
                    binding.textView.text = firstNumber.toString() + "-" + secondNumber.toString()
                } else if (operator == "multiply") {
                    binding.textView.text = firstNumber.toString() + "×" + secondNumber.toString()
                }
            }
        }


        //ボタン1がタップされたら
        binding.numberButton1.setOnClickListener {
            //符号の入力状態を持つ変数がemptyかそうでないかで処理を分ける
            if (operator == "empty") {
                //1番目に入力された数字を10倍して1を＋
                firstNumber = firstNumber * 10 + 1

                //数字を表示するTextviewに反映する
                binding.numberText.text = firstNumber.toString()

                //+ - ×ボタンを黄色にする
                binding.plusButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 0))
                binding.minusButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 0))
                binding.multiplyButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 0))
                //符号ボタンと等号ボタンを利用できるようにする
                binding.plusButton.isEnabled = true
                binding.minusButton.isEnabled = true
                binding.multiplyButton.isEnabled = true
                binding.equalButton.isEnabled = true

                binding.textView.text = firstNumber.toString()
            } else {
                //二番目に入力された数字を10倍して1を足し算する
                secondNumber = secondNumber * 10 + 1

                //数字を表示するTextViewに表示する
                binding.numberText.text = secondNumber.toString()
                //等号ボタンを黄色にする
                binding.equalButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 240))
                if (operator == "plus") {
                    binding.textView.text = firstNumber.toString() + "+" + secondNumber.toString()
                }else if (operator == "minus"){
                    binding.textView.text = firstNumber.toString() + "-" + secondNumber.toString()
                }else if (operator == "multiply") {
                    binding.textView.text = firstNumber.toString() + "×" + secondNumber.toString()
                }
            }
        }
        //ボタン1がタップされたら
        binding.numberButton2.setOnClickListener {
            //符号の入力状態を持つ変数がemptyかそうでないかで処理を分ける
            if (operator == "empty") {
                //1番目に入力された数字を10倍して1を＋
                firstNumber = firstNumber * 10 + 2
                //数字を表示するTextviewに反映する
                binding.numberText.text = firstNumber.toString()
                binding.textView.text = firstNumber.toString()
                //+ - ×ボタンを黄色にする
                binding.plusButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 0))
                binding.minusButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 0))
                binding.multiplyButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 0))
                //符号ボタンと等号ボタンを利用できるようにする
                binding.plusButton.isEnabled = true
                binding.minusButton.isEnabled = true
                binding.multiplyButton.isEnabled = true
                binding.equalButton.isEnabled = true
            } else {
                //二番目に入力された数字を10倍して1を足し算する
                secondNumber = secondNumber * 10 + 2
                //数字を表示するTextViewに表示する
                binding.numberText.text = secondNumber.toString()
                //等号ボタンを黄色にする
                binding.equalButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 240))
                binding.textView.text = secondNumber.toString()

                if (operator == "plus") {
                    binding.textView.text = firstNumber.toString() + "+" + secondNumber.toString()
                }else if (operator == "minus"){
                    binding.textView.text = firstNumber.toString() + "-" + secondNumber.toString()
                }else if (operator == "multiply") {
                    binding.textView.text = firstNumber.toString() + "×" + secondNumber.toString()
                }
            }
        }
        //ボタン1がタップされたら
        binding.numberButton3.setOnClickListener {
            //符号の入力状態を持つ変数がemptyかそうでないかで処理を分ける
            if (operator == "empty") {
                //1番目に入力された数字を10倍して1を＋
                firstNumber = firstNumber * 10 + 3
                //数字を表示するTextviewに反映する
                binding.numberText.text = firstNumber.toString()
                binding.textView.text = firstNumber.toString()
                //+ - ×ボタンを黄色にする
                binding.plusButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 0))
                binding.minusButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 0))
                binding.multiplyButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 0))
                //符号ボタンと等号ボタンを利用できるようにする
                binding.plusButton.isEnabled = true
                binding.minusButton.isEnabled = true
                binding.multiplyButton.isEnabled = true
                binding.equalButton.isEnabled = true
            } else {
                //二番目に入力された数字を10倍して1を足し算する
                secondNumber = secondNumber * 10 + 3
                //数字を表示するTextViewに表示する
                binding.numberText.text = secondNumber.toString()
                //等号ボタンを黄色にする
                binding.equalButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 240))
                binding.textView.text = secondNumber.toString()

                if (operator == "plus") {
                    binding.textView.text = firstNumber.toString() + "+" + secondNumber.toString()
                }else if (operator == "minus"){
                    binding.textView.text = firstNumber.toString() + "-" + secondNumber.toString()
                }else if (operator == "multiply") {
                    binding.textView.text = firstNumber.toString() + "×" + secondNumber.toString()
                }
            }
        }
        //ボタン1がタップされたら
        binding.numberButton4.setOnClickListener {
            //符号の入力状態を持つ変数がemptyかそうでないかで処理を分ける
            if (operator == "empty") {
                //1番目に入力された数字を10倍して1を＋
                firstNumber = firstNumber * 10 + 4
                //数字を表示するTextviewに反映する
                binding.numberText.text = firstNumber.toString()
                binding.textView.text = firstNumber.toString()
                //+ - ×ボタンを黄色にする
                binding.plusButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 0))
                binding.minusButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 0))
                binding.multiplyButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 0))
                //符号ボタンと等号ボタンを利用できるようにする
                binding.plusButton.isEnabled = true
                binding.minusButton.isEnabled = true
                binding.multiplyButton.isEnabled = true
                binding.equalButton.isEnabled = true
            } else {
                //二番目に入力された数字を10倍して1を足し算する
                secondNumber = secondNumber * 10 + 4
                //数字を表示するTextViewに表示する
                binding.numberText.text = secondNumber.toString()
                //等号ボタンを黄色にする
                binding.equalButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 240))
                binding.textView.text = secondNumber.toString()

                if (operator == "plus") {
                    binding.textView.text = firstNumber.toString() + "+" + secondNumber.toString()
                }else if (operator == "minus"){
                    binding.textView.text = firstNumber.toString() + "-" + secondNumber.toString()
                }else if (operator == "multiply") {
                    binding.textView.text = firstNumber.toString() + "×" + secondNumber.toString()
                }
            }
        }
        //ボタン1がタップされたら
        binding.numberButton5.setOnClickListener {
            //符号の入力状態を持つ変数がemptyかそうでないかで処理を分ける
            if (operator == "empty") {
                //1番目に入力された数字を10倍して1を＋
                firstNumber = firstNumber * 10 + 5
                //数字を表示するTextviewに反映する
                binding.numberText.text = firstNumber.toString()
                binding.textView.text = firstNumber.toString()
                //+ - ×ボタンを黄色にする
                binding.plusButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 0))
                binding.minusButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 0))
                binding.multiplyButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 0))
                //符号ボタンと等号ボタンを利用できるようにする
                binding.plusButton.isEnabled = true
                binding.minusButton.isEnabled = true
                binding.multiplyButton.isEnabled = true
                binding.equalButton.isEnabled = true
            } else {
                //二番目に入力された数字を10倍して1を足し算する
                secondNumber = secondNumber * 10 + 5
                //数字を表示するTextViewに表示する
                binding.numberText.text = secondNumber.toString()
                //等号ボタンを黄色にする
                binding.equalButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 240))
                binding.textView.text = secondNumber.toString()

                if (operator == "plus") {
                    binding.textView.text = firstNumber.toString() + "+" + secondNumber.toString()
                }else if (operator == "minus"){
                    binding.textView.text = firstNumber.toString() + "-" + secondNumber.toString()
                }else if (operator == "multiply") {
                    binding.textView.text = firstNumber.toString() + "×" + secondNumber.toString()
                }
            }
        }
        //ボタン1がタップされたら
        binding.numberButton6.setOnClickListener {
            //符号の入力状態を持つ変数がemptyかそうでないかで処理を分ける
            if (operator == "empty") {
                //1番目に入力された数字を10倍して1を＋
                firstNumber = firstNumber * 10 + 6
                //数字を表示するTextviewに反映する
                binding.numberText.text = firstNumber.toString()
                binding.textView.text = firstNumber.toString()
                //+ - ×ボタンを黄色にする
                binding.plusButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 0))
                binding.minusButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 0))
                binding.multiplyButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 0))
                //符号ボタンと等号ボタンを利用できるようにする
                binding.plusButton.isEnabled = true
                binding.minusButton.isEnabled = true
                binding.multiplyButton.isEnabled = true
                binding.equalButton.isEnabled = true
            } else {
                //二番目に入力された数字を10倍して1を足し算する
                secondNumber = secondNumber * 10 + 6
                //数字を表示するTextViewに表示する
                binding.numberText.text = secondNumber.toString()
                //等号ボタンを黄色にする
                binding.equalButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 240))
                binding.textView.text = secondNumber.toString()

                if (operator == "plus") {
                    binding.textView.text = firstNumber.toString() + "+" + secondNumber.toString()
                }else if (operator == "minus"){
                    binding.textView.text = firstNumber.toString() + "-" + secondNumber.toString()
                }else if (operator == "multiply") {
                    binding.textView.text = firstNumber.toString() + "×" + secondNumber.toString()
                }
            }
        }
        //ボタン1がタップされたら
        binding.numberButton7.setOnClickListener {
            //符号の入力状態を持つ変数がemptyかそうでないかで処理を分ける
            if (operator == "empty") {
                //1番目に入力された数字を10倍して1を＋
                firstNumber = firstNumber * 10 + 7
                //数字を表示するTextviewに反映する
                binding.numberText.text = firstNumber.toString()
                binding.textView.text = firstNumber.toString()
                //+ - ×ボタンを黄色にする
                binding.plusButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 0))
                binding.minusButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 0))
                binding.multiplyButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 0))
                //符号ボタンと等号ボタンを利用できるようにする
                binding.plusButton.isEnabled = true
                binding.minusButton.isEnabled = true
                binding.multiplyButton.isEnabled = true
                binding.equalButton.isEnabled = true
            } else {
                //二番目に入力された数字を10倍して1を足し算する
                secondNumber = secondNumber * 10 + 7
                //数字を表示するTextViewに表示する
                binding.numberText.text = secondNumber.toString()
                //等号ボタンを黄色にする
                binding.equalButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 240))
                binding.textView.text = secondNumber.toString()

                if (operator == "plus") {
                    binding.textView.text = firstNumber.toString() + "+" + secondNumber.toString()
                }else if (operator == "minus"){
                    binding.textView.text = firstNumber.toString() + "-" + secondNumber.toString()
                }else if (operator == "multiply") {
                    binding.textView.text = firstNumber.toString() + "×" + secondNumber.toString()
                }
            }
        }
        //ボタン1がタップされたら
        binding.numberButton8.setOnClickListener {
            //符号の入力状態を持つ変数がemptyかそうでないかで処理を分ける
            if (operator == "empty") {
                //1番目に入力された数字を10倍して1を＋
                firstNumber = firstNumber * 10 + 8
                //数字を表示するTextviewに反映する
                binding.numberText.text = firstNumber.toString()
                binding.textView.text = firstNumber.toString()
                //+ - ×ボタンを黄色にする
                binding.plusButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 0))
                binding.minusButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 0))
                binding.multiplyButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 0))
                //符号ボタンと等号ボタンを利用できるようにする
                binding.plusButton.isEnabled = true
                binding.minusButton.isEnabled = true
                binding.multiplyButton.isEnabled = true
                binding.equalButton.isEnabled = true
            } else {
                //二番目に入力された数字を10倍して1を足し算する
                secondNumber = secondNumber * 10 + 8
                //数字を表示するTextViewに表示する
                binding.numberText.text = secondNumber.toString()
                //等号ボタンを黄色にする
                binding.equalButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 240))
                binding.textView.text = secondNumber.toString()

                if (operator == "plus") {
                    binding.textView.text = firstNumber.toString() + "+" + secondNumber.toString()
                }else if (operator == "minus"){
                    binding.textView.text = firstNumber.toString() + "-" + secondNumber.toString()
                }else if (operator == "multiply") {
                    binding.textView.text = firstNumber.toString() + "×" + secondNumber.toString()
                }
            }
        }
        //ボタン1がタップされたら
        binding.numberButton9.setOnClickListener {
            //符号の入力状態を持つ変数がemptyかそうでないかで処理を分ける
            if (operator == "empty") {
                //1番目に入力された数字を10倍して1を＋
                firstNumber = firstNumber * 10 + 9
                //数字を表示するTextviewに反映する
                binding.numberText.text = firstNumber.toString()
                binding.textView.text = firstNumber.toString()
                //+ - ×ボタンを黄色にする
                binding.plusButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 0))
                binding.minusButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 0))
                binding.multiplyButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 0))
                //符号ボタンと等号ボタンを利用できるようにする
                binding.plusButton.isEnabled = true
                binding.minusButton.isEnabled = true
                binding.multiplyButton.isEnabled = true
                binding.equalButton.isEnabled = true
            } else {
                //二番目に入力された数字を10倍して1を足し算する
                secondNumber = secondNumber * 10 + 9
                //数字を表示するTextViewに表示する
                binding.numberText.text = secondNumber.toString()
                //等号ボタンを黄色にする
                binding.equalButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 240))
                binding.textView.text = secondNumber.toString()

                if (operator == "plus") {
                    binding.textView.text = firstNumber.toString() + "+" + secondNumber.toString()
                }else if (operator == "minus"){
                    binding.textView.text = firstNumber.toString() + "-" + secondNumber.toString()
                }else if (operator == "multiply") {
                    binding.textView.text = firstNumber.toString() + "×" + secondNumber.toString()
                }
            }
        }
        //+ボタンがタップされたら
        binding.plusButton.setOnClickListener {
            //+ボタンを赤色にする
            binding.plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(220, 0, 100))
            //-×ボタンを灰色にする
            binding.minusButton.backgroundTintList =
                ColorStateList.valueOf(Color.rgb(150, 150, 150))
            binding.multiplyButton.backgroundTintList =
                ColorStateList.valueOf(Color.rgb(150, 150, 150))
            //符号を入れる変数にplusという文字を入れる
            operator = "plus"
            //2番目に入力された数字をTextViewに反映する
            binding.numberText.text = secondNumber.toString()
            binding.textView.text = firstNumber.toString() + "+"
        }
        //+ボタンがタップされたら
        binding.minusButton.setOnClickListener {
            //+ボタンを赤色にする
            binding.minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(220, 0, 100))
            //-×ボタンを灰色にする
            binding.plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150, 150, 150))
            binding.multiplyButton.backgroundTintList =
                ColorStateList.valueOf(Color.rgb(150, 150, 150))
            //符号を入れる変数にplusという文字を入れる
            operator = "minus"
            //2番目に入力された数字をTextViewに反映する
            binding.numberText.text = secondNumber.toString()
            binding.textView.text = firstNumber.toString() + "-"
        }
        //+ボタンがタップされたら
        binding.multiplyButton.setOnClickListener {
            //+ボタンを赤色にする
            binding.multiplyButton.backgroundTintList =
                ColorStateList.valueOf(Color.rgb(220, 0, 100))
            //-×ボタンを灰色にする
            binding.plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150, 150, 150))
            binding.minusButton.backgroundTintList =
                ColorStateList.valueOf(Color.rgb(150, 150, 150))
            //符号を入れる変数にplusという文字を入れる
            operator = "multiply"
            //2番目に入力された数字をTextViewに反映する
            binding.numberText.text = secondNumber.toString()
            binding.textView.text = firstNumber.toString() + "×"
        }
        //=ボタンがタップされたら
        binding.equalButton.setOnClickListener {
            if (operator == "plus") {
                //符号が＋だったら足し算をする
                totalNumber = firstNumber + secondNumber
                binding.textView.text = firstNumber.toString() + "+" + secondNumber.toString() + "="
            } else if (operator == "minus") {
                //符号が-だったらひきざんをする
                totalNumber = firstNumber - secondNumber
                binding.textView.text = firstNumber.toString() + "-" + secondNumber.toString() + "="
            } else if (operator == "multiply") {
                //符号が×だったら掛け算をする
                totalNumber = firstNumber * secondNumber
                binding.textView.text = firstNumber.toString() + "×" + secondNumber.toString() + "="
            }
            //符号ボタンと等号ボタンを灰色にする
            binding.plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            binding.minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            binding.multiplyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            binding.equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))

            //1番目、2番目に入力される数字を入れる変数を初期化
            firstNumber = 0
            secondNumber = 0
            //符号の入力状態を持つ変数を初期化
            operator = "empty"
            //合計をTextViewに表示
            binding.numberText.text = totalNumber.toString()
        }

        //クリアボタンがタップされたら
        binding.clearButton.setOnClickListener {
            //符号ボタンと等号ボタンを灰色にする
            binding.plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            binding.minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            binding.multiplyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            binding.equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            firstNumber = 0
            secondNumber = 0
            totalNumber = 0
            operator = "empty"
            binding.numberText.text = totalNumber.toString()
            binding.textView.text = "0".toString()

        }

    }

}