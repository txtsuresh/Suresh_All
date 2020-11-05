import inspect
import logging


class BaseClass:
    def test_log(self):
        loggerName = inspect.stack()[1][3]
        logger=logging.getLogger(loggerName)
        formatter=logging.Formatter("%(asctime)s :%(levelname)s :%(name)s :%(message)s")

        fileHandler=logging.FileHandler('logFile.log')
        fileHandler.setFormatter(formatter)

        log=logger.addHandler(fileHandler)

        logger.setLevel(logging.DEBUG)
        return logger